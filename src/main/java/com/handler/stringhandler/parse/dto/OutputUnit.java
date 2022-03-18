package com.handler.stringhandler.parse.dto;

import lombok.Getter;

public class OutputUnit {

    @Getter
    private final String quotient;

    @Getter
    private final String remainder;

    public OutputUnit(final String str, final int unitCount) {
        final int length = str.length();
        final int remainCount = length % unitCount;
        final int divideStandard = length - remainCount;

        quotient = str.substring(0, divideStandard);
        remainder = str.substring(divideStandard, length);
    }
}
