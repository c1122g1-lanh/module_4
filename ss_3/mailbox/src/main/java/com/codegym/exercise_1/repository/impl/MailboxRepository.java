package com.codegym.exercise_1.repository.impl;

import com.codegym.exercise_1.repository.IMailboxRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MailboxRepository implements IMailboxRepository {

    @Override
    public String[] languages() {
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }

    @Override
    public Integer[] pageSize() {
        return new Integer[]{5, 10, 15, 25, 50, 100};
    }
}
