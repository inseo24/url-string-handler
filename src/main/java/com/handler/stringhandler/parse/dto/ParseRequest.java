package com.handler.stringhandler.parse.dto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParseRequest {
    private final String url;
    private final String exposureType;
    private final String unitCount;
}
