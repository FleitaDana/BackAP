package Ap.portfolioFleita.services;

import Ap.portfolioFleita.models.Experience;
import Ap.portfolioFleita.repositories.ExperienceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience addExperience(Experience experience){
        return experienceRepository.save(experience);
    }

    public List<Experience> searchExperiences(){
        return experienceRepository.findAll();
    }

    public Experience editExperience(Experience experience){
        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long id){
        experienceRepository.deleteById(id);
    }
}


