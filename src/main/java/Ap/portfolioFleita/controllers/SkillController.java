package Ap.portfolioFleita.controllers;

import Ap.portfolioFleita.models.Skill;
import Ap.portfolioFleita.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")
public class SkillController {

    @Autowired
    private final SkillService skillService;

    public SkillController(SkillService skillsService) {
        this.skillService = skillsService;
    }

    @GetMapping
    public ResponseEntity<List<Skill>> getSkills(){
        List<Skill> skills= skillService.searchSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Skill> editSkill(@RequestBody Skill skill){
        Skill editSkill=skillService.editSkill(skill);
        return new ResponseEntity<>(editSkill,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> createSkill(@RequestBody Skill skill){
        Skill newSkill=skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
