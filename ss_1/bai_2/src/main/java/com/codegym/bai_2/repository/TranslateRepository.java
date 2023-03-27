package com.codegym.bai_2.repository;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TranslateRepository implements ITranslateRepository {
    static Map<String,String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello","xin chào");
        dictionary.put("yes","có");
        dictionary.put("no","không");
        dictionary.put("one","một");
        dictionary.put("two","hai");
        dictionary.put("three","ba");
        dictionary.put("four","bốn");
        dictionary.put("five","năm");
    }

    @Override
    public String translate(String key) {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return  null;
    }
}
