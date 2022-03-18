package com.handler.stringhandler.parse.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OutputUnitTest {

    public static final String SAMPLE_TEXT = "A0B0a0b0ccc";

    @DisplayName("문자열과 자연수 unit Count가 주어질 때 몫 문자열과 나머지 문자열 부분을 얻을 수 있다.")
    @Test
    void normal() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, 3);

        assertThat(outputUnit.getQuotient()).isEqualTo("A0B0a0b0c");
        assertThat(outputUnit.getRemainder()).isEqualTo("cc");
    }

    @DisplayName("몫이 딱 떨어지는 경우 나머지는 empty")
    @Test
    void remainEmpty() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, SAMPLE_TEXT.length());

        assertThat(outputUnit.getQuotient()).isEqualTo(SAMPLE_TEXT);
        assertThat(outputUnit.getRemainder()).isEmpty();
    }

    @DisplayName("출력 묶음 단위로 나눠지지 않으면 몫은 empty다.")
    @Test
    void quotientEmpty() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, SAMPLE_TEXT.length() + 1);

        assertThat(outputUnit.getQuotient()).isEmpty();
        assertThat(outputUnit.getRemainder()).isEqualTo(SAMPLE_TEXT);
    }

    @DisplayName("target String 이 empty면 몫과 나머지 모두 empty")
    @Test
    void allEmpty() {
        final OutputUnit outputUnit = new OutputUnit("", 1);

        assertThat(outputUnit.getQuotient()).isEmpty();
        assertThat(outputUnit.getRemainder()).isEmpty();
    }

    @DisplayName("unit Count 가 0이면 Arithmetic Exception 이 발생한다.")
    @Test
    void divideZero() {
        assertThatThrownBy(() -> {
            new OutputUnit(SAMPLE_TEXT, 0);
        }).isInstanceOf(ArithmeticException.class);
    }
}