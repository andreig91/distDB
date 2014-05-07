package com.distDB.dao.sqlite.impl;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.distDB.dao.TracksDAO;
import com.distDB.model.Track;
import com.distDB.utils.sqlite.BetterSQLiteOpenHelper;
import com.noveogroup.android.log.Log;

public class TracksDAOImpl extends BetterSQLiteOpenHelper implements TracksDAO{
	public static final String RELEASE_DATE_FORMAT = "YYYY-MM-DD";

	private static int DATABASE_VERSION = 4;
	private static final String DATABASE_NAME = "tracks";
	private static final String TABLE_TRACKS = "tracks";
	private static final String TABLE_MOVIE_TRACK = "movie_track";

	private static final String INIT_SQL_FILE_NAME = "tracks.sql";

	public TracksDAOImpl(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION, INIT_SQL_FILE_NAME);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		execBatchSQL(db, dbIitializeSqls);
		Log.d(DATABASE_NAME + " database created successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		execBatchSQL(db, dbIitializeSqls);
		Log.d(DATABASE_NAME + " database created successfully");
	}

	@Override
	public List<Track> getTracks(int movieId) {
		List<Track> tracks = new ArrayList<Track>();
		String getTracksFromMovieId = "SELECT * FROM " + TABLE_TRACKS + " t, " + TABLE_MOVIE_TRACK + " tm " + "WHERE tm.mId = " + movieId + " AND t.tId = tm.tId";
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(getTracksFromMovieId, null);

		while(cursor.moveToNext()) {
			Track track = new Track();
			track.settId(cursor.getInt(0));
			track.setTitle(cursor.getString(1));
			track.setAuthor(cursor.getString(2));
			track.setReleaseDate(cursor.getString(3));
			track.setDuration(cursor.getInt(4));
			tracks.add(track);
		}
		return tracks;
	}
}
