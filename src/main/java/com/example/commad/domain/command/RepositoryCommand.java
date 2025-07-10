package com.example.commad.domain.command;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class RepositoryCommand implements OrderCommand {

    @Override
    public void execute() {
        log.info("COMMAND: {}", ThreadContext.get("command"));
    }

}
