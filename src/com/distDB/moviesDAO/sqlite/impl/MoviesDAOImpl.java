package com.distDB.moviesDAO.sqlite.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.distDB.model.Movie;
import com.distDB.moviesDAO.MoviesDAO;
import com.noveogroup.android.log.Log;
 
public class MoviesDAOImpl extends SQLiteOpenHelper implements MoviesDAO{
 
    public static final String RELEASE_DATE_FORMAT = "YYYY-MM-DD";
    
	private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "movies";
    private static final String TABLE_MOVIE = "movies";
    
    private AssetManager assetMgr;
    private List<String> dbIitializeSqls = new ArrayList<String>();
 
    public MoviesDAOImpl(Context context, AssetManager assetMgr) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.assetMgr = assetMgr;
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
    	getInitializeSQLStatements(assetMgr);
        execBatchSQL(db, dbIitializeSqls);
        Log.d("Movies database created successfully");
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    	getInitializeSQLStatements(assetMgr);
    	execBatchSQL(db, dbIitializeSqls);
        Log.d("Movies database upgraded successfully");
    }
    
    public List<Movie> getMovies() {
    	List<Movie> movies = new ArrayList<Movie>();
    	
    	String query = "SELECT * FROM " + TABLE_MOVIE;

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
    
    private void getInitializeSQLStatements(AssetManager assetMgr) {
		try {
			BufferedReader moviesSql = new BufferedReader(new InputStreamReader(assetMgr.open("DbScripts/movies.sqll")));
			String sql = moviesSql.readLine();
			while(sql != null) {
				// Do not add comments
				if (!sql.startsWith("--")) {
					dbIitializeSqls.add(sql);
				}
				sql = moviesSql.readLine();
			}
			moviesSql.close();
		} catch (IOException e) {
			throw new IllegalStateException("Could not read SQL files used to initialize Movies DB", e);
		}
	}
    
    private void execBatchSQL(SQLiteDatabase db, List<String> batchSql) {
    	for(String sql : batchSql) {
    		db.execSQL(sql);
    	}
    }
}