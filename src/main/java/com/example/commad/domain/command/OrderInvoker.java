package com.example.commad.domain.command;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public class OrderInvoker {
    private final List<OrderCommand> orderCommands = new ArrayList<>();

    public void addCommand(OrderCommand orderCommand) {
        orderCommands.add(orderCommand);
    }

    public void executeCommands() {
        orderCommands.forEach(OrderCommand::execute);
    }
}
