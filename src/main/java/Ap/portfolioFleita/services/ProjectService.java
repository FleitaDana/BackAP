package Ap.portfolioFleita.services;

import Ap.portfolioFleita.models.Project;
import Ap.portfolioFleita.repositories.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    public Project addProject(Project project){
        return projectRepository.save(project);
    }

    public List<Project> searchProjects(){
        return projectRepository.findAll();
    }

    public Project editProject(Project project){
        return projectRepository.save(project);
    }

    public void deleteProject(Long id){
        projectRepository.deleteById(id);
    }
}
