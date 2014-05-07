package com.distDB.utils.sqlite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class BetterSQLiteOpenHelper extends SQLiteOpenHelper {
	private String SQL_FILES_BASE_FOLDER = "DbScripts/";
	protected List<String> dbIitializeSqls = new ArrayList<String>();

	public BetterSQLiteOpenHelper(Context context, String name, CursorFactory factory, int version, String initSqlFileName) {
		super(context, name, factory, version);
		getInitializeSQLStatements(initSqlFileName, context);
	}

	private void getInitializeSQLStatements(String initSqlFileName, Context context) {
		try {
			BufferedReader initSql = new BufferedReader(new InputStreamReader(context.getAssets().open(SQL_FILES_BASE_FOLDER + initSqlFileName)));
			String sql = initSql.readLine();
			while (sql != null) {
				// Do not add comments
				if (!sql.startsWith("--")) {
					dbIitializeSqls.add(sql);
				}
				sql = initSql.readLine();
			}
			initSql.close();
		} catch (IOException e) {
			throw new IllegalStateException("Could not read SQL files used to initialize DB using " + initSqlFileName + " file", e);
		}
	}

	protected void execBatchSQL(SQLiteDatabase db, List<String> batchSql) {
		for (String sql : batchSql) {
			db.execSQL(sql);
		}
	}
}
