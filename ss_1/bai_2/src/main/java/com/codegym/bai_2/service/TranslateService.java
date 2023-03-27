package com.codegym.bai_2.service;

import com.codegym.bai_2.repository.TranslateRepository;

public class TranslateService implements ITranslateService{
    TranslateRepository translateRepository = new TranslateRepository();

    @Override
    public String translate(String key) {
        return translateRepository.translate(key);
    }
}
