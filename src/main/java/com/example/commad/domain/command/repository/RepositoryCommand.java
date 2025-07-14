package com.example.commad.domain.command.repository;

import com.example.commad.domain.command.OrderCommand;
import com.example.commad.domain.service.RepositoryService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.BadRequestException;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Log4j2
@Component
public class RepositoryCommand implements OrderCommand {

    //TODO: Verificar essa parte do código.
    private final ApplicationContext applicationContext;
    private String action;
    private String entity;

    public RepositoryCommand(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void execute(Map<String, Object> context) throws BadRequestException {
        log.info("COMMAND: {}", ThreadContext.get("command"));
        this.getProperties(context);

        EntityFactory entityFactory = EntityFactory.getEntity(this.entity);
        RepositoryService repositoryService = (RepositoryService) applicationContext.getBean(entityFactory.getService());
        repositoryService.save();


        log.info("Final command Repository");
    }

    private void getProperties(Map<String, Object> context) throws BadRequestException {
        try {
            Map<String, Object> properties = Optional.of(context.get("properties"))
                    .map(prop -> (Map<String, Object>) prop)
                    .orElseThrow(() -> new BadRequestException("Key properties not found"));

            this.action = properties.get("action").toString();
            this.entity = properties.get("entity").toString();

        } catch (NullPointerException e) {
            throw new BadRequestException(String.format("Field action or entity is null, message: %s", e.getMessage()));
        }
    }

}
