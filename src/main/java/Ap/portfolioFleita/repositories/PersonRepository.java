package Ap.portfolioFleita.repositories;

import Ap.portfolioFleita.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
