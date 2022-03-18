package com.handler.stringhandler.parse.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ParseRequest {
    private final String url;
    private final String exposureType;
    private final String unitCount;
}
