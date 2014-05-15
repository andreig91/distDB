package com.distDB.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int mId;
	private String title;
	private String releaseDate;
	private List<Track> tracks = new ArrayList<Track>();

	public Movie(int mId, String title, String releaseDate, List<Track> tracks) {
		this.mId = mId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.tracks = tracks;
	}

	public Movie() {
	}

	@Override
	public String toString() {
		return "Movie #" + mId + " - " + title + "\n" + "Tracks\n" + tracks.toString() + "\n\n";
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void addTrack(Track track) {
		tracks.add(track);
	}

	public void addTracks(List<Track> tracks) {
		if(tracks != null) {
			for(Track track : tracks) {
				this.tracks.add(track);
			}
		}
	}

	public List<Track> getTracks() {
		return tracks;
	}
}
