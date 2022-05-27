package Ap.portfolioFleita.services;


import Ap.portfolioFleita.exceptions.UserNotFoundException;
import Ap.portfolioFleita.models.Person;
import Ap.portfolioFleita.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person addPerson(Person person){ return personRepository.save(person); }

    public Person editPerson(Person person){
        return personRepository.save(person);
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    public Person searchPersonById(Long id){
        return personRepository.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
}
