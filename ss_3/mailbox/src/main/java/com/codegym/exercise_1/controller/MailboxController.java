package com.codegym.exercise_1.controller;

import com.codegym.exercise_1.model.Mailbox;
import com.codegym.exercise_1.service.impl.MailboxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailboxController {

    private MailboxService mailboxService = new MailboxService();
    String[] languages = mailboxService.languages();
    Integer[] pageSize = mailboxService.pageSize();

    @GetMapping("form1")
    public String showFormUpdate(Model model) {
        model.addAttribute("mailbox", new Mailbox());

        model.addAttribute("language", languages);

        model.addAttribute("pagesize", pageSize);
        return "form";
    }

    @PostMapping("form")
    public String updateMailbox(Model model,
                                @ModelAttribute Mailbox mailbox,
                                BindingResult bindingResult
    ) {
        model.addAttribute("mailbox", mailbox);
        model.addAttribute("language", languages);
        model.addAttribute("pagesize", pageSize);
        return "form";
    }
}
