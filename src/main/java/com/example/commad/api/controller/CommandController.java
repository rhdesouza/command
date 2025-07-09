package com.example.commad.api.controller;

import com.example.commad.api.documentation.CommandControllerDocumentation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Log4j2
@RestController("/v1/command")
public class CommandController implements CommandControllerDocumentation {

    @GetMapping
    public ResponseEntity<List<String>> getCommands() {
        return ResponseEntity.ok(Collections.emptyList());
    }

}
