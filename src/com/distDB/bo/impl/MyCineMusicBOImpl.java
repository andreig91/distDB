package com.distDB.bo.impl;

import java.util.List;

import android.content.Context;

import com.distDB.bo.MyCineMusicBO;
import com.distDB.dao.MyCineMusicDAO;
import com.distDB.dao.TracksDAO;
import com.distDB.dao.sqlite.impl.MyCineMusicDAOImpl;
import com.distDB.dao.sqlite.impl.TracksDAOImpl;
import com.distDB.model.Movie;

public class MyCineMusicBOImpl implements MyCineMusicBO{
	private MyCineMusicDAO myCineMusicDAO;
	private TracksDAO tracksDAO;

	public MyCineMusicBOImpl(Context context) {
		this.myCineMusicDAO = new MyCineMusicDAOImpl(context);
		this.tracksDAO = new TracksDAOImpl(context);
	}

	@Override
	public List<Movie> getMoviesWithTracks() {
		List<Movie> movies = myCineMusicDAO.getMovies();
		for(Movie movie : movies) {
			movie.addTracks(tracksDAO.getTracks(movie.getmId()));
		}
		return movies;
	}
}
