DROP TABLE IF EXISTS movies;
CREATE TABLE movies(mId INTEGER PRIMARY KEY autoincrement, title TEXT, release_date TEXT);
INSERT INTO movies VALUES(1, "Movie1", "2013-01-01");
INSERT INTO movies VALUES(2, "Movie2", "2013-02-02");
INSERT INTO movies VALUES(3, "Movie3", "2013-03-03");