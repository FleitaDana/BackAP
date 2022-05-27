package Ap.portfolioFleita.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "id_experience")
    private Long idExperience;

    @Column(name= "title_experience", length = 100, nullable = false)
    private String titleExperience;

    @Column(name= "start_date_experience", columnDefinition = "DATE", nullable = false)
    private LocalDate startDateExperience;

    @Column(name= "finish_date_experience", columnDefinition = "DATE", nullable = false)
    private LocalDate finishDateExperience;

    @Column(name= "description_Experience", length = 200, nullable = false)
    private String descriptionExperience;

    @Column(name= "photo_experience", length = 100, nullable = false)
    private String photoExperience;

    public Experience() {
    }

    public Experience(Long idExperience, String titleExperience, LocalDate startDateExperience, LocalDate finishDateExperience, String descriptionExperience, String photoExperience) {
        this.idExperience = idExperience;
        this.titleExperience = titleExperience;
        this.startDateExperience = startDateExperience;
        this.finishDateExperience = finishDateExperience;
        this.descriptionExperience = descriptionExperience;
        this.photoExperience = photoExperience;
    }

    public Long getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Long idExperience) {
        this.idExperience = idExperience;
    }

    public String getTitleExperience() {
        return titleExperience;
    }

    public void setTitleExperience(String titleExperience) {
        this.titleExperience = titleExperience;
    }

    public LocalDate getStartDateExperience() {
        return startDateExperience;
    }

    public void setStartDateExperience(LocalDate startDateExperience) {
        this.startDateExperience = startDateExperience;
    }

    public LocalDate getFinishDateExperience() {
        return finishDateExperience;
    }

    public void setFinishDateExperience(LocalDate finishDateExperience) {
        this.finishDateExperience = finishDateExperience;
    }

    public String getDescriptionExperience() {
        return descriptionExperience;
    }

    public void setDescriptionExperience(String descriptionExperience) {
        this.descriptionExperience = descriptionExperience;
    }

    public String getPhotoExperience() {
        return photoExperience;
    }

    public void setPhotoExperience(String photoExperience) {
        this.photoExperience = photoExperience;
    }
}


