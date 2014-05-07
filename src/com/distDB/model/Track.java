package com.distDB.model;

public class Track {
	private int tId;
	private String title;
	private String author;
	private String releaseDate;
	private int duration;

	public Track(int tId, String author, String releaseDate, int duration) {
		this.tId = tId;
		this.author = author;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public Track() {
	}

	@Override
	public String toString() {
		return "#" + tId + " - " + title + "\n";
	}

	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}