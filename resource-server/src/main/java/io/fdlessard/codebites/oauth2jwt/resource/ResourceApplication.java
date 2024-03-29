package io.fdlessard.codebites.oauth2jwt.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run( ResourceApplication.class, args);
    }

}
