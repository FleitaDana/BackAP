package Ap.portfolioFleita.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "id_education")
    private Long idEducation;

    @Column(name= "title_education", length = 100, nullable = false)
    private String titleEducation;

    @Column(name= "start_date_education", columnDefinition = "DATE", nullable = false)
    private LocalDate startDateEducation;

    @Column(name= "finish_date_education", columnDefinition = "DATE", nullable = false)
    private LocalDate finishDateEducation;

    @Column(name= "description_education", length = 200, nullable = false)
    private String descriptionEducation;

    @Column(name= "photo_education", length = 100, nullable = false)
    private String photoEducation;

    public Education() {
    }

    public Education(Long idEducation, String titleEducation, LocalDate startDateEducation, LocalDate finishDateEducation, String descriptionEducation, String photoEducation) {
        this.idEducation = idEducation;
        this.titleEducation = titleEducation;
        this.startDateEducation = startDateEducation;
        this.finishDateEducation = finishDateEducation;
        this.descriptionEducation = descriptionEducation;
        this.photoEducation = photoEducation;
    }

    public Long getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Long idEducation) {
        this.idEducation = idEducation;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public void setTitleEducation(String titleEducation) {
        this.titleEducation = titleEducation;
    }

    public LocalDate getStartDateEducation() {
        return startDateEducation;
    }

    public void setStartDateEducation(LocalDate startDateEducation) {
        this.startDateEducation = startDateEducation;
    }

    public LocalDate getFinishDateEducation() {
        return finishDateEducation;
    }

    public void setFinishDateEducation(LocalDate finishDateEducation) {
        this.finishDateEducation = finishDateEducation;
    }

    public String getDescriptionEducation() {
        return descriptionEducation;
    }

    public void setDescriptionEducation(String descriptionEducation) {
        this.descriptionEducation = descriptionEducation;
    }

    public String getPhotoEducation() {
        return photoEducation;
    }

    public void setPhotoEducation(String photoEducation) {
        this.photoEducation = photoEducation;
    }
}
