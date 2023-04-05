package com.codegym.validate_song_information.repository;

import com.codegym.validate_song_information.model.Song;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongRepository extends PagingAndSortingRepository<Song,Integer> {
}
