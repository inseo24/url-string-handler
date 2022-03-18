package com.handler.stringhandler.parse.service;

import com.handler.stringhandler.parse.dto.ParseRequest;
import com.handler.stringhandler.parse.dto.ParseResponse;
import com.handler.stringhandler.parse.util.Arranger;
import com.handler.stringhandler.parse.util.Interleaver;
import com.handler.stringhandler.parse.util.Separator;
import com.handler.stringhandler.parse.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;
    private final Arranger arranger;
    private final Interleaver interleaver;

    public ParseResponse parse(ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());
        final String exposedHtml = request.getExposureType().getExposedHtml(html);
        final Arranger rearrange = arranger.rearrange(exposedHtml);
        final String interleavedText = interleaver.interleave(rearrange);

        return null;
    }
}
