package com.handler.stringhandler.parse.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UrlConnectorTest {

    private final UrlConnector urlConnector = new UrlConnector();


    @DisplayName("잘못된 url 입력시 IllegalArgumentException 발생")
    @Test
    void urlFailTest() {
        assertThatThrownBy(() -> urlConnector.getHtml("wrong.url.ccc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("url 입력 시 html 을 가져올 수 있다.")
    @ParameterizedTest
    @CsvSource({"https://www.naver.com, <title>NAVER</title>", "https://www.google.com, <title>Google</title>"})
    void urlSuccessfulTest(final String url, final String title) {
        final String result = urlConnector.getHtml(url);

        assertThat(result.contains(title)).isTrue();
    }

    @DisplayName("잘못된 url 입력시 IllegalArgumentException 발생")
    @Test
    void textTest() {
        final String result = urlConnector.getText("https://www.naver.com");
        System.out.println(result);


    }
}