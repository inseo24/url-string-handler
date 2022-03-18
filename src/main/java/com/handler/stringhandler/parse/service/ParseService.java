package com.handler.stringhandler.parse.service;

import com.handler.stringhandler.parse.dto.ParseRequest;
import com.handler.stringhandler.parse.dto.ParseResponse;
import com.handler.stringhandler.parse.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;

    public ParseResponse parse(ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());
        final String exposedHtml = request.getExposureType().getExposedHtml(html);

        return null;
    }
}
