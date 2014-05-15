import urllib2, json, os, sys

reload(sys); sys.setdefaultencoding('UTF8')

def removeLinesFromFile(pathOfFile, *removeFilesWithThisTextList):
	'''
	Removes any lines for the given file that contains all the values passed
	Parameters:
		pathOfFile - The path of the file from which to remove lines
		removeFilesWithThisTextList - The list of tokens that a line that should be removed should contain
	'''
	with open(pathOfFile, "r") as file:
		lines = file.readlines()
		with open(pathOfFile, "w") as file:
			for line in lines:
				for removeFilesWithThisText in removeFilesWithThisTextList:
					if not removeFilesWithThisText in line:
						# If as much as one token is not found in the file, do not remove it
						file.write(line)
						break

def insertMovies(file, moviesJson, movieID):
	for index, movie in enumerate(moviesJson['results']):
		title = movie['title'].replace('"',"")
		release_date = movie['release_date'].replace('"', "")
		insertStmt = 'INSERT INTO movies VALUES(' + str(movieID) + ',"' + title + '","' + release_date + '");\n'
		movieID = movieID + 1
		file.write(insertStmt)
	return movieID



sys.setdefaultencoding('UTF-8')
trackSqlPath = os.path.realpath(os.getcwd()+'/../DBScripts/tracks.sql')
# Remove all lines from tracks.sql that have both 'INSERT' and 'tracks' in them
removeLinesFromFile(trackSqlPath, "INSERT", "tracks")

tracksJson = urllib2.urlopen("http://api.deezer.com/search?q=trance").read()
#print json.dumps(json.loads(tracksJson), sort_keys=True, indent=4, separators=(',', ': '))
tracksJson = json.loads(tracksJson)
trackID = 0
with open(trackSqlPath, "a") as file:
	for index, track in enumerate(tracksJson['data']):
		title = track['title'].replace('"',"")
		artistName = track['artist']['name'].replace('"', "")
		albumName = track['album']['title'].replace('"', "")
		insertStmt = 'INSERT INTO tracks VALUES(' + str(index) + ',"' + title + '","' + artistName + '","' + albumName + '",' + str(track['duration']) + ');\n'
		file.write(insertStmt)
		trackID = trackID + 1

movieSqlPath = os.path.realpath(os.getcwd()+'/../DBScripts/myCineMusic.sql')
movieApiQuery = "https://api.themoviedb.org/3/search/movie?api_key=7127643d0491ca507e041b6a52043cfd&query=t"
removeLinesFromFile(movieSqlPath, "INSERT", "movies")

moviesJson = urllib2.urlopen(movieApiQuery).read()
#print json.dumps(json.loads(moviesJson), sort_keys=True, indent=4, separators=(',', ': '))
moviesJson = json.loads(moviesJson)
movieID = 0
with open(movieSqlPath, "a") as file:
	for index in range(1,moviesJson['total_pages']):
		moviesJson = urllib2.urlopen(movieApiQuery + "&page=" + str(index)).read()
		moviesJson = json.loads(moviesJson)
		movieID = insertMovies(file, moviesJson, movieID)

removeLinesFromFile(trackSqlPath, "INSERT", "movie_track")
with open(trackSqlPath, "a") as file:
	for index in range(trackID):
		insertStmt = 'INSERT INTO movie_track VALUES(' + str(index) + ',' + str(index) + ');\n'
		file.write(insertStmt)

