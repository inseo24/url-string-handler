package com.handler.stringhandler.parse.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SorterTest {

    private final Sorter sorter = new Sorter();

    @DisplayName("영어를 정렬할 때 AaBb 순으로 정렬한다.")
    @Test
    void englishSortTest() {
        final String result = sorter.sort("CCCccDDDSSSAABBccbbaaJDKEIKLQ");

        System.out.println(result);

        assertThat(result).isEqualTo("AAaaBBbbCCCccccDDDDEIJKKLQSSS");
    }

    @DisplayName("숫자를 정렬할 때 0-9 순으로 오름차순 정렬한다.")
    @Test
    void numberSortTest() {
        final String result = sorter.sort("2384571118927384957283495");

        System.out.println(result);

        assertThat(result).isEqualTo("1112223334445557778888999");
    }

}