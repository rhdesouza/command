package com.example.commad.domain.command;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@NoArgsConstructor
public class OrderInvoker {
    private final List<OrderCommand> orderCommands = new ArrayList<>();
    private Map<String, Object> context;

    public void addCommand(OrderCommand orderCommand, Map<String, Object> contextParam) {
        orderCommands.add(orderCommand);
        this.context = contextParam;
    }

    public void executeCommands() {
        orderCommands.forEach(orderCommand -> {
            try {
                orderCommand.execute(context);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
