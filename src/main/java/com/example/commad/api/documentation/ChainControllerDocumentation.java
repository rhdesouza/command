package com.example.commad.api.documentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Tag(name = "Chain", description = "Chian Controller")
public interface ChainControllerDocumentation {

    @Operation(summary = "Test", description = "Serviço de teste para chain")
    void executeChain(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Execute Chain", required = true,
                    content = @Content(mediaType = "application/json",
                            examples = @ExampleObject(value = "{\n" +
                                    "    \"chain\": \"teste\",\n" +
                                    "    \"commands\": [\n" +
                                    "        {\n" +
                                    "            \"command\": \"testeCommand\",\n" +
                                    "            \"properties\": {\n" +
                                    "                \"action\": \"save\",\n" +
                                    "                \"entity\": \"correntista\"\n" +
                                    "            }\n" +
                                    "        }\n" +
                                    "    ]\n" +
                                    "}")))
            @RequestBody Map<String, Object> chain);
}
