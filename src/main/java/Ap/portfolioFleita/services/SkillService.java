package Ap.portfolioFleita.services;

import Ap.portfolioFleita.exceptions.UserNotFoundException;
import Ap.portfolioFleita.models.Skill;
import Ap.portfolioFleita.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public List<Skill> searchSkills(){
        return skillRepository.findAll();
    }

    public Skill editSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

    public Skill searchSkillById(Long id){
        return skillRepository.findById(id).orElseThrow(() ->new UserNotFoundException("Skill no encontrado"));
    }
}
