package Ap.portfolioFleita.services;

import Ap.portfolioFleita.models.Education;
import Ap.portfolioFleita.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education addEducation(Education education){
        return educationRepository.save(education);
    }

    public List<Education> searchEducations(){
        return educationRepository.findAll();
    }

    public Education editEducation(Education education){
        return educationRepository.save(education);
    }

    public void deleteEducation(Long id){
        educationRepository.deleteById(id);
    }
}
