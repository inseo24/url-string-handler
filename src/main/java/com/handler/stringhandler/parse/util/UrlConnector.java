package com.handler.stringhandler.parse.util;

import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {

    public String getHtml(final String url){
        // jsoup
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e){
            throw new IllegalArgumentException("접근할 수 없는 url 입니다.");
        }
    }
}
