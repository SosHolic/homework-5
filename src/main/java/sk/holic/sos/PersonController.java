package sk.holic.sos;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class PersonController {

    static Set<Person> databaseOfPeople = new HashSet<Person>();

    @GetMapping("/persons")
    public Set<Person> getDatabaseOfPeople(){
        return databaseOfPeople;
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable long id){
        for(Person p : databaseOfPeople){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @PostMapping("/person")
    public void safePerson(@RequestBody Person person){
        databaseOfPeople.add(person);
    }

    @PutMapping("/person")
    public void editPerson(Person person){
        Person personInDb = this.getPerson(person.getId());
        personInDb.setName(person.getName());
        personInDb.setSurname(person.getSurname());
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable long id){
        Person person = this.getPerson(id);
        databaseOfPeople.remove(person);
    }

}
