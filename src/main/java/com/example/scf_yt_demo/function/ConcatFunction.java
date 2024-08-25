package com.example.scf_yt_demo.function;

import java.util.function.Function;

public class ConcatFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.concat(" - NEW STR");
    }
}
