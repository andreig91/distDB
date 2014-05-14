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

sys.setdefaultencoding('UTF-8')
trackSqlPath = os.path.realpath(os.getcwd()+'/../DBScripts/tracks.sql')
# Remove all lines from tracks.sql that have both 'INSERT' and 'tracks' in them
removeLinesFromFile(trackSqlPath, "INSERT", "tracks")

tracksJson = urllib2.urlopen("http://api.deezer.com/search?q=trance").read()
#print json.dumps(json.loads(tracksJson), sort_keys=True, indent=4, separators=(',', ': '))
tracksJson = json.loads(tracksJson)

with open(trackSqlPath, "a") as file:
	for index, track in enumerate(tracksJson['data']):
		title = track['title'].replace('"',"")
		artistName = track['artist']['name'].replace('"', "")
		albumName = track['album']['title'].replace('"', "")
		insertStmt = 'INSERT INTO tracks VALUES("' + title + '","' + artistName + '","' + albumName + '",' + str(track['duration']) + ')\n'
		file.write(insertStmt)

movieSqlPath = os.path.realpath(os.getcwd()+'/../DBScripts/myCineMusic.sql')