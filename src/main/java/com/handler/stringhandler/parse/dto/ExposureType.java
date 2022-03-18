package com.handler.stringhandler.parse.dto;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public enum ExposureType {
    REMOVE_HTML(str -> str.replaceAll(Constants.REMOVE_TAG_PATTERN, Constants.EMPTY)),
    ALL_TEXT(str -> str);

    private final Function<String, String> function;

    public String getExposedHtml(final String str){
        return function.apply(str);
    }

    private static class Constants {

        private static final String REMOVE_TAG_PATTERN = "<[^>]*>";
        public static final String EMPTY = "";
    }

}
