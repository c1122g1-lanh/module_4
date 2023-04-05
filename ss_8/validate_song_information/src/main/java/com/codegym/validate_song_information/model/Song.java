package com.codegym.validate_song_information.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(800)")
    @NotBlank(message = "Không được để trống")
//    @Max(value = 800, message = "Không được vượt quá 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$",message = "Không được có ký tự đặc biệt")
    private String name;

    @Column(name = "artist", columnDefinition = "varchar(300)")
    @NotBlank(message = "Không được để trống")
//    @Max(value = 300, message = "Không được vượt quá 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$",message = "Không được có ký tự đặc biệt")
    private String artist;

    @Column(name = "category", columnDefinition = "varchar(1000)")
    @NotBlank(message = "Không được để trống")
//    @Max(value = 1000, message = "Không được vượt quá 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$",message = "Không được có ký tự đặc biệt")
    private String category;

    public Song() {
    }

    public Song(Integer id, String name, String artist, String category) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
