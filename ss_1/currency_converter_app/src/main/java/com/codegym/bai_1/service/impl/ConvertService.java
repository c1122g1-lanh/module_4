package com.codegym.bai_1.service.impl;

import com.codegym.bai_1.service.IConvertService;

public class ConvertService implements IConvertService {
    @Override
    public Double convert(Double usd) {
        Double result = usd * 25000;
        return result;
    }
}
