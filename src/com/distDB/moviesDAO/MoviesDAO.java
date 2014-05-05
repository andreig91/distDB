package com.distDB.moviesDAO;

import java.util.List;

import com.distDB.model.Movie;

public interface MoviesDAO {
	List<Movie> getMovies();
}