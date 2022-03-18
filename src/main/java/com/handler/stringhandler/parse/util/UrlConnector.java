package com.handler.stringhandler.parse.util;

import com.handler.stringhandler.parse.error.UrlConnectionException;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {

    public String getHtml(final String url){
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e){
            throw new UrlConnectionException("접근할 수 없는 url 입니다.");
        }
    }

    public String getText(final String url){
        try {
            return Jsoup.connect(url).get().text();
        } catch (IOException e){
            throw new IllegalArgumentException("접근할 수 없는 url 입니다.");
        }
    }
}
