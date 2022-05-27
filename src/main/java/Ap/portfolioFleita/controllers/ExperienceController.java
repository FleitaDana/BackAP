package Ap.portfolioFleita.controllers;

import Ap.portfolioFleita.models.Experience;
import Ap.portfolioFleita.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    @Autowired
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getExperiencia(){
        List<Experience> experiences=experienceService.searchExperiences();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Experience> editExperiencia(@RequestBody Experience experience){
        Experience editExperience=experienceService.editExperience(experience);
        return new ResponseEntity<>(editExperience,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience){
        Experience newExperience=experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
