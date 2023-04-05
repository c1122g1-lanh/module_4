package com.codegym.validate_song_information.service;

import com.codegym.validate_song_information.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    Song create(Song song);

    List<Song> findAll();

    Optional<Song> findBYId(int id);
}
