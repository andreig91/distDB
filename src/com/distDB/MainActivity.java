package com.distDB;

import java.util.List;

import com.distDB.UI.utils.Utils;
import com.distDB.model.Movie;
import com.distDB.moviesDAO.MoviesDAO;
import com.distDB.moviesDAO.sqlite.impl.MoviesDAOImpl;
import com.noveogroup.android.log.Log;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
			super.onCreate(savedInstanceState);
			
			MoviesDAO moviesDAO = new MoviesDAOImpl(this, getAssets());    
			List<Movie> movies = moviesDAO.getMovies();

			TextView text = new TextView(this);
			text.setText(movies.toString());
			setContentView(text);
		} catch (Exception e) {
			Utils.messageBox("Fatal Error", "A Fatal Error was encountered. The application will exit", this);
			Log.e(e);
		}
    }
}