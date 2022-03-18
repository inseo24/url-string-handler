package com.handler.stringhandler.parse.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrangerTest {

    private final Arranger arranger = new Arranger(new Separator(), new Sorter());

    @DisplayName("String 을 입력 받으면 정렬된 영어 + 정렬된 숫자를 얻을 수 있다.")
    @Test
    void normalCase() {
        final Arranger arrange = arranger.rearrange("e4C3ddBA2A38c1DE9f");

        assertAll(
                () -> assertThat(arrange.getSortedEnglish()).isEqualTo("AABCcDddEef"),
                () -> assertThat(arrange.getSortedNumber()).isEqualTo("1233489")
        );
    }

    @DisplayName("입력 받은 String 에 숫자, 영어 이외의 문자를 지운다")
    @Test
    void removeSpecialChars() {
        final Arranger arrange = arranger.rearrange("e4C#3dd<BA2!%A38@c1D***E^9f");

        assertAll(
                () -> assertThat(arrange.getSortedEnglish()).isEqualTo("AABCcDddEef"),
                () -> assertThat(arrange.getSortedNumber()).isEqualTo("1233489")
        );
    }

}