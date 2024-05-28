package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Song;

public interface SongService {

	void addSong(Song song);

	public List<Song> fetchAllSongs();
	
	public boolean songExists(String name);

	void updateSong(Song song);
}
