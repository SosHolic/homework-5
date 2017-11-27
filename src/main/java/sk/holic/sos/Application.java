package sk.holic.sos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static sk.holic.sos.PersonController.databaseOfPeople;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    void populateDb() {
        databaseOfPeople.add(
                new Person()
                        .setId(1)
                        .setName("Martin")
                        .setSurname("Tlachac"));
    }
}