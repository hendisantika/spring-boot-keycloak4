package com.hendisantika;

import com.hendisantika.entity.Plant;
import com.hendisantika.repository.PlantRepository;
import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootKeycloak5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeycloak5Application.class, args);
    }

    @Bean
    public KeycloakConfigResolver KeycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

    @Bean
    public ApplicationRunner run(PlantRepository plantRepository) throws Exception {
        return (ApplicationArguments args) -> {
            List<Plant> plants = Arrays.asList(
                    new Plant("subalpine fir", "abies lasiocarpa", "pinaceae"),
                    new Plant("sour cherry", "prunus cerasus", "rosaceae"),
                    new Plant("asian pear", "pyrus pyrifolia", "rosaceae")
            );
            plantRepository.saveAll(plants);
        };
    }
}
