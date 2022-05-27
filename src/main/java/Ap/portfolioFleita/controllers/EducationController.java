package Ap.portfolioFleita.controllers;

import Ap.portfolioFleita.models.Education;
import Ap.portfolioFleita.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education")
public class EducationController {

    @Autowired
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public ResponseEntity<List<Education>> getEducations(){
        List<Education> educations=educationService.searchEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Education> editEducation(@RequestBody Education education){
        Education editEducation=educationService.editEducation(education);
        return new ResponseEntity<>(editEducation,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Education> createEducation(@RequestBody Education education){
        Education newEducation=educationService.addEducation(education);
        return new ResponseEntity<>(newEducation,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
