package com.codegym.validate_song_information.controller;

import com.codegym.validate_song_information.model.Song;
import com.codegym.validate_song_information.service.impl.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    private SongService service;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Song song, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            model.addAttribute("song", service.create(new Song()));
            model.addAttribute("message", "Create success");
            return "/list";
        }

    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("listSong", service.findAll());
        return "/list";
    }

}
