package net.benyghil.chatbotrag;

import net.benyghil.chatbotrag.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class EnsetChatbotRagApplication {

    private final PersonRepository personRepository;

    public EnsetChatbotRagApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EnsetChatbotRagApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            for (int i = 0; i < 100; i++) {
                Person person = Person.builder()
                        .name(UUID.randomUUID().toString().substring(0, 8))
                        .email(UUID.randomUUID().toString().substring(0, 8) + "@gmail.com")
                        .build();
                personRepository.save(person);
            }
        };
    };
}
