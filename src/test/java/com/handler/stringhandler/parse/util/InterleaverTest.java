package com.handler.stringhandler.parse.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class InterleaverTest {

    private final Interleaver interleaver = new Interleaver();

    @DisplayName("문자열 2개가 주어질 때 하나씩 교차해 출력함. 남은 것은 뒤에 붙임")
    @ParameterizedTest
    @CsvSource({
            "aaaaaaaaa, 1111111, a1a1a1a1a1a1a1aa",
            "AAAAAbbbbbCCCCcDDDdddEeee, 0123456789, A0A1A2A3A4b5b6b7b8b9CCCCcDDDdddEeee",
            "ABbCcDEeFff, 0123456789, A0B1b2C3c4D5E6e7F8f9f"
    })
    void interleaveTest(final String str1, final String str2, final String result) {
//        assertThat(interleaver.interleave(str1, str2)).isEqualTo(result);
    }

}