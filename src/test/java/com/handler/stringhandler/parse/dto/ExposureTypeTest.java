package com.handler.stringhandler.parse.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ExposureTypeTest {

    @DisplayName("REMOVE_HTML 타입이면 태그를 삭제한다.")
    @Test
    void removeHtml() {
        final String result = ExposureType.REMOVE_HTML.getExposedHtml("<div>abc</div>");
        assertThat(result).isEqualTo("abc");
    }

    @DisplayName("ALL_TEXT 타입이면 모든 텍스트를 가져온다.")
    @Test
    void allText() {
        final String result = ExposureType.ALL_TEXT.getExposedHtml("<div>abc</div>");
        assertThat(result).isEqualTo("<div>abc</div>");
    }

}