package com.example.commad.domain.command;

import java.util.Map;

public interface OrderCommand {
    void execute(Map<String, Object> context) throws Exception;
}
