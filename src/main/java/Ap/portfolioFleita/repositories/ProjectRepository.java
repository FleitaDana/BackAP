package Ap.portfolioFleita.repositories;

import Ap.portfolioFleita.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
