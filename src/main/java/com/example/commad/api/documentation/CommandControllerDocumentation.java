package com.example.commad.api.documentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

@Tag(name = "Command", description = "Command Controller")
public interface CommandControllerDocumentation {

    @Operation(summary = "Get Command", description = "Retornar todos os commands cadastrados")
    ResponseEntity<List<String>> getCommands();

    @Operation(summary = "Execute Command", description = "Executa o comando")
    void executeCommand(@io.swagger.v3.oas.annotations.parameters.RequestBody(
                                description = "Execute Command", required = true,
                                content = @Content(mediaType = "application/json",
                                        examples = @ExampleObject(value = "{\n" +
                                                "            \"command\": \"testeCommand\",\n" +
                                                "            \"properties\": {\n" +
                                                "                \"action\": \"save\",\n" +
                                                "                \"entity\": \"correntista\"\n" +
                                                "            }\n" +
                                                "        }\n"
                                        )))
                        Map<String, Object> context);
}
