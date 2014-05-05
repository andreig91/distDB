DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS movie_soundtrack;
CREATE TABLE movies(mId INTEGER PRIMARY KEY, title TEXT, release_date TEXT);
INSERT INTO movies VALUES(1,"Movie1", "2013-01-01");
INSERT INTO movies VALUES(2,"Movie2", "2013-02-02");
CREATE TABLE movie_soundtrack(mId INTEGER, sId INTEGER, PRIMARY KEY(mId, sId));