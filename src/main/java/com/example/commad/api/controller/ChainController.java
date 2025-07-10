package com.example.commad.api.controller;

import com.example.commad.api.documentation.ChainControllerDocumentation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j2
@RestController
@RequestMapping("/v1/chain")
public class ChainController implements ChainControllerDocumentation {

    @PostMapping
    public void executeChain(@RequestBody Map<String, Object> chain) {
        log.info("Execute Chain: {}", chain);
    }

}
