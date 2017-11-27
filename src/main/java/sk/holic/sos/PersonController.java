package sk.holic.sos;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class PersonController {

    static Set<Person> databaseOfPeople = new HashSet<Person>();

    // implement method for getting all people from database mapped to "/persons

    // implement method for getting one person based on id mapped to "/person/{id}" if person with such id does not exists return null

    // implement method for inserting/saving person mapped to "/person"

    // implement method for editing person mapped to "/person"

    // implement method for deleting person mapped to "/person/{id}"


}
