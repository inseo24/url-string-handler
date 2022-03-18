package com.handler.stringhandler.parse.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SeparatorTest {

    private final Separator separator = new Separator();

    @DisplayName("String 을 입력 받으면 영어 부분과 숫자 부분을 얻을 수 있다.")
    @Test
    void normalCase() {
        final Separator sep = separator.separator("e4C3ddBA2A38cDE9f");
        assertAll(
                () -> assertThat(sep.getEnglish()).isEqualTo("eCddBAAcDEf"),
                () -> assertThat(sep.getNumber()).isEqualTo("432389")
        );
    }

    @DisplayName("String 을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우를 지운다.")
    @Test
    void removeSpecialChars() {
        final Separator sep = separator.separator("e4cI#*@KFLs39J(d!1as2");
        assertAll(
                () -> assertThat(sep.getEnglish()).isEqualTo("ecIKFLsJdas"),
                () -> assertThat(sep.getNumber()).isEqualTo("43912")
        );
    }

}