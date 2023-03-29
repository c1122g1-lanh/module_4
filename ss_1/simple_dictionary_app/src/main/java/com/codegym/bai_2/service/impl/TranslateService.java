package com.codegym.bai_2.service.impl;

import com.codegym.bai_2.repository.impl.TranslateRepository;
import com.codegym.bai_2.service.ITranslateService;

public class TranslateService implements ITranslateService {
    TranslateRepository translateRepository = new TranslateRepository();

    @Override
    public String translate(String key) {
        return translateRepository.translate(key);
    }
}
