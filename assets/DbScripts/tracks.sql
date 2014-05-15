DROP TABLE IF EXISTS tracks;
DROP TABLE IF EXISTS movie_track;
CREATE TABLE tracks(tId INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, author TEXT, album TEXT, duration INTEGER);
CREATE TABLE movie_track(mId INTEGER, tId INTEGER, PRIMARY KEY(mId, tId));
INSERT INTO tracks VALUES(0,"Ghost Town (Radio Edit)","W&W","A State Of Trance Radio Top 30 - March / April / May 2014",204);
INSERT INTO tracks VALUES(1,"EIFORYA (Radio Edit)","Armin van Buuren","A State Of Trance Radio Top 30 - March / April / May 2014",161);
INSERT INTO tracks VALUES(2,"Epic (Original Mix)","Sandro Silva & Quintino","Trance Essentials 2012, Vol. 1 (Unmixed)",360);
INSERT INTO tracks VALUES(3,"Ping Pong (Radio Edit)","Armin van Buuren","A State Of Trance 2014 (Unmixed)",179);
INSERT INTO tracks VALUES(4,"Right in the Night (Radio Edit)","ZOE","Best Dance Covers (House Trance Electro Style)",261);
INSERT INTO tracks VALUES(5,"U (Bryan Kearney Radio Edit)","Gareth Emery","A State Of Trance Radio Top 30 - March / April / May 2014",252);
INSERT INTO tracks VALUES(6,"Free tibet","Hilight Tribe","Love medicine & natural trance",359);
INSERT INTO tracks VALUES(7,"EIFORYA (Intro Radio Edit)","Armin van Buuren","A State Of Trance 2014 (Unmixed)",167);
INSERT INTO tracks VALUES(8,"Haunted (Radio Edit)","Marlo","A State Of Trance 2014 (Unmixed)",247);
INSERT INTO tracks VALUES(9,"Electro Trance (Fullon Psytrance Mix)","Phoenix","100 Hard Trance Hits 2014",429);
INSERT INTO tracks VALUES(10,"Visions (Radio Edit)","Marlo","A State Of Trance 2014 (Unmixed)",201);
INSERT INTO tracks VALUES(11,"In Trance (Studio Edit)","Scorpions","MTV Unplugged (The Studio Edits)",231);
INSERT INTO tracks VALUES(12,"The Tube (Max Angel Remix)","DJ Tiësto","Trance Raider - Tomb 6",467);
INSERT INTO tracks VALUES(13,"Medusa (Radio Edit)","Adam Szabo","A State Of Trance Radio Top 30 - March / April / May 2014",222);
INSERT INTO tracks VALUES(14,"Save My Night (Original Mix)","Armin van Buuren","A State Of Trance Radio Top 20 - January 2014 (Including Classic Bonus Track)",337);
INSERT INTO tracks VALUES(15,"Ping Pong [Mix Cut] (Original Mix)","Armin van Buuren","A State Of Trance 2014 (Mixed Version)",405);
INSERT INTO tracks VALUES(16,"My Heaven (Radio Edit)","Alex M.O.R.P.H.","A State Of Trance Radio Top 30 - March / April / May 2014",222);
INSERT INTO tracks VALUES(17,"U (Bryan Kearney Radio Edit)","Gareth Emery","A State Of Trance 2014 (Unmixed)",252);
INSERT INTO tracks VALUES(18,"Save My Night [Mix Cut] (MaRLo Remix)","Armin van Buuren","Armada Trance 2014-001 (Mixed Version)",198);
INSERT INTO tracks VALUES(19,"Stop Pushing (Hard Psytrance Mix)","Phoenix","100 Hard Trance Hits 2014",346);
INSERT INTO tracks VALUES(20,"In Trance (Studio Edit)","Scorpions","MTV Unplugged (The Studio Edits)",231);
INSERT INTO tracks VALUES(21,"My Heaven (Radio Edit)","Alex M.O.R.P.H.","A State Of Trance 2014 (Unmixed)",222);
INSERT INTO tracks VALUES(22,"Samba trance (Original)","Hilight Tribe","Limboland",239);
INSERT INTO tracks VALUES(23,"Marijuana (Live Remix) [feat. Cortex & Didrapest]","1200 Micrograms","101 Psychedelic Dance Hits 2013 - Best of Top New Goa Psy Trance, Hard Electronica, Rave Anthems, Acid House, Electro, Hard Style",385);
INSERT INTO tracks VALUES(24,"Stop Pushing (2013 Mix)","Phoenix","Decade of Deca-dance 1 - 10 years of Psychedelic Goa Techno Trance Evolution (2004-2014)",546);
INSERT INTO tracks VALUES(25,"Save My Night (MaRLo Radio Edit)","Armin van Buuren","Armada Trance 2014-001 (Unmixed)",209);
INSERT INTO tracks VALUES(26,"Everything (Pedro Del Mar & Doublev Remix)","Tiësto","Miami Vocal Trance Essentials 2014",453);
INSERT INTO tracks VALUES(27,"Ping Pong (Simon Patterson Radio Edit)","Armin van Buuren","Armada Trance 2014-001 (Unmixed)",216);
INSERT INTO tracks VALUES(28,"Athena (Radio Edit)","Dart Rayne","A State Of Trance Radio Top 30 - March / April / May 2014",228);
INSERT INTO tracks VALUES(29,"EIFORYA [Mix Cut] (Intro Mix)","Armin van Buuren","A State Of Trance 2014 (Mixed Version)",320);
INSERT INTO tracks VALUES(30,"Save My Night (Allen Watts Radio Edit)","Armin van Buuren","A State Of Trance 2014 (Unmixed)",187);
INSERT INTO tracks VALUES(31,"Zybex - Saico Psybex - 145 - [ Trance / Goa / Fullon ]","DJ Electronica Trance","69 Electronica (Best of Top Electronic Dance Music, Goa, Techno, Psytrance, Acid House, Hard Dance, Trance Anthems, Dubstep Hits)",504);
INSERT INTO tracks VALUES(32,"Goodbye (Radio Edit)","Andrew Rayel","A State Of Trance 2014 (Unmixed)",190);
INSERT INTO tracks VALUES(33,"Athena (Radio Edit)","Dart Rayne","A State Of Trance 2014 (Unmixed)",228);
INSERT INTO tracks VALUES(34,"Saltwater [Mix Cut] (Original Mix)","Chicane","A State Of Trance 650 - New Horizons",134);
INSERT INTO tracks VALUES(35,"Electro Trance","Phoenix","101 Edm Rave Hits 2013 - Top Electronica Workout, Dubstep, Trap, Electro, Techno, Goa, Trance Anthems",429);
INSERT INTO tracks VALUES(36,"EIFORYA [Mix Cut] (Original Mix)","Armin van Buuren","Armada Trance 2014-001 (Mixed Version)",149);
INSERT INTO tracks VALUES(37,"We Are Here To Make Some Noise (Extended Mix)","Armin van Buuren","A State Of Trance Radio Top 20 - June 2012 (Including Classic Bonus Track)",312);
INSERT INTO tracks VALUES(38,"Poseidon (Radio Edit)","Marlo","Armada Trance 2014-001 (Unmixed)",210);
INSERT INTO tracks VALUES(39,"Crying Freemen - Icontol - 145 - [ Trance / Goa / Fullon ]","DJ Electronica Trance","69 Electronica (Best of Top Electronic Dance Music, Goa, Techno, Psytrance, Acid House, Hard Dance, Trance Anthems, Dubstep Hits)",477);
INSERT INTO tracks VALUES(40,"EIFORYA (Radio Edit)","Armin van Buuren","Armada Trance 2014-001 (Unmixed)",161);
INSERT INTO tracks VALUES(41,"For An Angel [Mix Cut] (PvD E-Werk Club Mix)","Paul van Dyk","A State Of Trance 650 - New Horizons",113);
INSERT INTO tracks VALUES(42,"My Heaven [Mix Cut] (Original Mix)","Alex M.O.R.P.H.","A State Of Trance 2014 (Mixed Version)",218);
INSERT INTO tracks VALUES(43,"Haunted [Mix Cut] (Original Mix)","Marlo","A State Of Trance 2014 (Mixed Version)",212);
INSERT INTO tracks VALUES(44,"Ping Pong [Mix Cut] (Simon Patterson Remix)","Armin van Buuren","Armada Trance 2014-001 (Mixed Version)",206);
INSERT INTO tracks VALUES(45,"End Of The Road (Hazem Beltagui Radio Edit)","Aly & Fila","A State Of Trance Radio Top 30 - March / April / May 2014",254);
INSERT INTO tracks VALUES(46,"Never Say Goodbye (Radio Edit)","Hardwell and Dyro featuring Bright Lights","Trance The Ultimate Collection Vol 3 2013",204);
INSERT INTO tracks VALUES(47,"Where To Now (Will Atkinson Gold Radio Edit)","Aly & Fila","A State Of Trance Radio Top 30 - March / April / May 2014",246);
INSERT INTO tracks VALUES(48,"Empire Of Hearts (Radio Edit)","Gaia","A State Of Trance Radio Top 30 - March / April / May 2014",196);
INSERT INTO tracks VALUES(49,"Destino","Markus Schulz","A State Of Trance 2014 (Unmixed)",279);
INSERT INTO movie_track VALUES(0,0);
INSERT INTO movie_track VALUES(1,1);
INSERT INTO movie_track VALUES(2,2);
INSERT INTO movie_track VALUES(3,3);
INSERT INTO movie_track VALUES(4,4);
INSERT INTO movie_track VALUES(5,5);
INSERT INTO movie_track VALUES(6,6);
INSERT INTO movie_track VALUES(7,7);
INSERT INTO movie_track VALUES(8,8);
INSERT INTO movie_track VALUES(9,9);
INSERT INTO movie_track VALUES(10,10);
INSERT INTO movie_track VALUES(11,11);
INSERT INTO movie_track VALUES(12,12);
INSERT INTO movie_track VALUES(13,13);
INSERT INTO movie_track VALUES(14,14);
INSERT INTO movie_track VALUES(15,15);
INSERT INTO movie_track VALUES(16,16);
INSERT INTO movie_track VALUES(17,17);
INSERT INTO movie_track VALUES(18,18);
INSERT INTO movie_track VALUES(19,19);
INSERT INTO movie_track VALUES(20,20);
INSERT INTO movie_track VALUES(21,21);
INSERT INTO movie_track VALUES(22,22);
INSERT INTO movie_track VALUES(23,23);
INSERT INTO movie_track VALUES(24,24);
INSERT INTO movie_track VALUES(25,25);
INSERT INTO movie_track VALUES(26,26);
INSERT INTO movie_track VALUES(27,27);
INSERT INTO movie_track VALUES(28,28);
INSERT INTO movie_track VALUES(29,29);
INSERT INTO movie_track VALUES(30,30);
INSERT INTO movie_track VALUES(31,31);
INSERT INTO movie_track VALUES(32,32);
INSERT INTO movie_track VALUES(33,33);
INSERT INTO movie_track VALUES(34,34);
INSERT INTO movie_track VALUES(35,35);
INSERT INTO movie_track VALUES(36,36);
INSERT INTO movie_track VALUES(37,37);
INSERT INTO movie_track VALUES(38,38);
INSERT INTO movie_track VALUES(39,39);
INSERT INTO movie_track VALUES(40,40);
INSERT INTO movie_track VALUES(41,41);
INSERT INTO movie_track VALUES(42,42);
INSERT INTO movie_track VALUES(43,43);
INSERT INTO movie_track VALUES(44,44);
INSERT INTO movie_track VALUES(45,45);
INSERT INTO movie_track VALUES(46,46);
INSERT INTO movie_track VALUES(47,47);
INSERT INTO movie_track VALUES(48,48);
INSERT INTO movie_track VALUES(49,49);
