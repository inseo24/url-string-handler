package com.handler.stringhandler.parse.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class Sorter {

    // 영어 -> AAaBBb
    // 숫자 -> 0123

    public static final String EMPTY = "";

    public String sort(final String str){
        return Arrays.stream(str.split(EMPTY))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
    }
}
