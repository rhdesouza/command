package com.example.commad.api.controller;

import com.example.commad.api.documentation.CommandControllerDocumentation;
import com.example.commad.domain.command.CommandFactory;
import com.example.commad.domain.command.OrderInvoker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/v1/command")
@RequiredArgsConstructor
public class CommandController implements CommandControllerDocumentation {

    private final OrderInvoker orderInvoker;

    @GetMapping
    public ResponseEntity<List<String>> getCommands() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping
    public void executeCommand(@RequestParam(value = "command") final String commandName) {
        ThreadContext.put("command", "RepositoryCommand");
        CommandFactory command = CommandFactory.getCommand(commandName);
        orderInvoker.addCommand(command.getOrderCommand());
        orderInvoker.executeCommands();
        ThreadContext.clearStack();
    }
}
