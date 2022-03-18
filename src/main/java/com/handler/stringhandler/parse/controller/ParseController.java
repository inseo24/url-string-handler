package com.handler.stringhandler.parse.controller;

import com.handler.stringhandler.parse.dto.ParseRequest;
import com.handler.stringhandler.parse.dto.ParseResponse;
import com.handler.stringhandler.parse.service.ParseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ParseController {

    private final ParseService parseService;

    /*
     request -> url, type, 출력 묶음 단위
     response -> 몫, 나머지
     */
    @PostMapping("/ api/parse")
    public ResponseEntity<ParseResponse> parse(@RequestBody @Valid ParseRequest request) {
        final ParseResponse response = parseService.parse(request);
        return null;
    }
}
