package com.codegym.exercise_1.service.impl;

import com.codegym.exercise_1.repository.impl.MailboxRepository;
import com.codegym.exercise_1.service.IMailboxService;
import org.springframework.stereotype.Service;

@Service
public class MailboxService implements IMailboxService {

    private MailboxRepository mailboxRepository = new MailboxRepository();

    @Override
    public String[] languages() {
        return mailboxRepository.languages();
    }

    @Override
    public Integer[] pageSize() {
        return mailboxRepository.pageSize();
    }
}
