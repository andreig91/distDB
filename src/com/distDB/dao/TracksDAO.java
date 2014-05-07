package com.distDB.dao;

import java.util.List;

import com.distDB.model.Track;

public interface TracksDAO {

	List<Track> getTracks(int movieId);
}
