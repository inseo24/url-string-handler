package com.handler.stringhandler.parse.dto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParseResponse {
    private final String quotient;
    private final String remainder;

    public ParseResponse(final OutputUnit outputUnit){
        this.quotient = outputUnit.getQuotient();
        this.remainder = outputUnit.getRemainder();
    }
}
