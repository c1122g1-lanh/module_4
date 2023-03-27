package com.codegym.bai_1.service;

public class ConvertService implements IConvertService {


     @Override
     public Double convert(Double usd) {
          Double result = usd * 25000;
          return result ;
     }
}
