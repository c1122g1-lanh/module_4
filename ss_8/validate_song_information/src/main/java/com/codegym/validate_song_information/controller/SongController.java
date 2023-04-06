package com.codegym.validate_song_information.controller;

import com.codegym.validate_song_information.model.Song;
import com.codegym.validate_song_information.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    ISongService songService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("listSong", songService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Song song, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            songService.create(song);
            model.addAttribute("song", song);
            return "redirect:";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.findBYId(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String showEditForm(@Valid @ModelAttribute Song song, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "edit";
        } else {
            songService.create(song);
            return "redirect:";
        }
    }

}
