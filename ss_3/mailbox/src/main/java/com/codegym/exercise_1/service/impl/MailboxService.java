package com.codegym.exercise_1.service.impl;

import com.codegym.exercise_1.repository.impl.MailboxRepository;
import com.codegym.exercise_1.service.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailboxService implements IMailboxService {
    @Autowired
    private MailboxRepository mailboxRepository;

    @Override
    public String[] languages() {
        return mailboxRepository.languages();
    }

    @Override
    public Integer[] pageSize() {
        return mailboxRepository.pageSize();
    }
}
