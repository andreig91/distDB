package com.distDB;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.distDB.bo.MyCineMusicBO;
import com.distDB.bo.impl.MyCineMusicBOImpl;
import com.distDB.model.Movie;
import com.distDB.utils.UI.Utils;
import com.noveogroup.android.log.Log;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);

			MyCineMusicBO myCineMusicBO = new MyCineMusicBOImpl(this);
			List<Movie> movies = myCineMusicBO.getMoviesWithTracks();

			TextView text = new TextView(this);
			text.setText(movies.toString());
			setContentView(text);
		} catch (Exception e) {
			Utils.messageBox("Fatal Error", "A Fatal Error was encountered. The application will exit", this);
			Log.e(e);
		}
	}
}