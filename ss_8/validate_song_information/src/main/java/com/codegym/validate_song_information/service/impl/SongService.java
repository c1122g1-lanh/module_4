package com.codegym.validate_song_information.service.impl;

import com.codegym.validate_song_information.model.Song;
import com.codegym.validate_song_information.repository.ISongRepository;
import com.codegym.validate_song_information.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService implements ISongService {

    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public Song create(Song song) {
        return iSongRepository.save(song);
    }

    @Override
    public List<Song> findAll() {
        return (List<Song>) iSongRepository.findAll();
    }

    @Override
    public Optional<Song> findBYId(int id) {
        return iSongRepository.findById(id);
    }
}
