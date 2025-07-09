package com.example.commad;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "Rafael H de Souza",
						email = "rhdesouza@hotmail.com"
						//url = "https://aliboucoding.com/course"
				),
				description = "Poc Command",
				title = "Commands",
				version = "1.0",
				license = @License(
						name = "Licence name",
						url = "https://some-url.com"
				),
				termsOfService = "Terms of service"
		),
		servers = {
				@Server(
						description = "Local ENV",
						url = "http://localhost:8080"
				)
		}
)

@SpringBootApplication
public class CommadApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommadApplication.class, args);
	}

}
