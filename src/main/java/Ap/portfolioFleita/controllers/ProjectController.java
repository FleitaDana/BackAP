package Ap.portfolioFleita.controllers;

import Ap.portfolioFleita.models.Project;
import Ap.portfolioFleita.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping
    public ResponseEntity<List<Project>> getProject(){
        List<Project> projects=projectService.searchProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Project> editProject(@RequestBody Project project){
        Project updateProject=projectService.editProject(project);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project){
        Project newProject=projectService.addProject(project);
        return new ResponseEntity<>(newProject,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
