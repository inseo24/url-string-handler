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
        urlConnector.getHtml(request.getUrl());
        return null;
    }
}
