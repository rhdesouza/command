package com.example.commad.api.documentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "Command", description = "Command Controller")
public interface CommandControllerDocumentation {
    @Operation(summary = "Get Command", description = "Retornar todos os commands cadastrados")
    ResponseEntity<List<String>> getCommands();
}
