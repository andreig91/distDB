package com.distDB.dao.sqlite.impl;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.distDB.dao.MyCineMusicDAO;
import com.distDB.model.Movie;
import com.distDB.utils.sqlite.BetterSQLiteOpenHelper;
import com.noveogroup.android.log.Log;

public class MyCineMusicDAOImpl extends BetterSQLiteOpenHelper implements MyCineMusicDAO{

	public static final String RELEASE_DATE_FORMAT = "YYYY-MM-DD";

	private static int DATABASE_VERSION = 4;
	private static final String DATABASE_NAME = "myCineMusic";
	private static final String TABLE_MOVIES = "movies";
	private static final String INIT_SQL_FILE_NAME = "myCineMusic.sql";


	public MyCineMusicDAOImpl(Context context) {
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
		Log.d(DATABASE_NAME + " database upgraded successfully");
	}

	@Override
	public List<Movie> getMovies() {
		List<Movie> movies = new ArrayList<Movie>();

		String query = "SELECT * FROM " + TABLE_MOVIES;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(query, null);

		while(cursor.moveToNext()) {
			Movie movie = new Movie();
			movie.setmId(cursor.getInt(0));
			movie.setTitle(cursor.getString(1));
			movie.setReleaseDate(cursor.getString(2));
			movies.add(movie);
		}
		db.close();
		return movies;
	}
}