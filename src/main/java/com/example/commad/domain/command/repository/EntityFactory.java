package com.example.commad.domain.command.repository;

import com.example.commad.domain.service.RepositoryService;
import com.example.commad.infrastructure.entity.AccountHolderEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum EntityFactory {

    ACCOUNT_HOLDER(AccountHolderEntity.class, RepositoryService.class);

    private final Class<?> entity;
    private final Class<?> service;

    EntityFactory(Class<?> entity, Class<?> service) {
        this.entity = entity;
        this.service = service;
    }

    public static EntityFactory getEntity(@NotNull final String entityName) {
        return Stream.of(values())
                .filter(entityFactory -> entityFactory.name().equalsIgnoreCase(entityName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("Command %s not found", entityName)));
    }
}
