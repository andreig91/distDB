package com.distDB.model;

public class Movie {
	private int mId;
	private String title;
	private String releaseDate;
	
	public Movie(int mId, String title, String releaseDate) {
		this.mId = mId;
		this.title = title;
		this.releaseDate = releaseDate;
	}

	public Movie() {	
	}
	
	@Override
	public String toString() {
		return "#" + mId + " - " + title; 
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
}
