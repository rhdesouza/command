package com.example.commad.domain.command;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum CommandFactory {

    REPOSITORY(new RepositoryCommand());

    private final OrderCommand orderCommand;

    CommandFactory(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public static CommandFactory getCommand(@NotNull final String commandName) {
        return Stream.of(values())
                .filter(commandFactory -> commandFactory.name().equalsIgnoreCase(commandName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("Command %s not found", commandName)));
    }

}
