package Ap.portfolioFleita.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name= "id_person")
    private Long idPerson;

    @Column(name= "name_person", length = 100, nullable = false)
    private String namePerson;

    @Column(name= "lastName_person", length = 100, nullable = false)
    private String lastNamePerson;

    @Column(name= "title_person", length = 100, nullable = false)
    private String titlePerson;

    @Column(name= "description_person", length = 1000, nullable = false)
    private String descriptionPerson;

    @Column(name= "profilePhoto_person", length = 100, nullable = false)
    private String profilePhotoPerson;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducation")
    private List<Education> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;


    public Person() {
    }

    public Person(Long idPerson, String namePerson, String lastNamePerson, String titlePerson, String descriptionPerson, String profilePhotoPerson) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.lastNamePerson = lastNamePerson;
        this.titlePerson = titlePerson;
        this.descriptionPerson = descriptionPerson;
        this.profilePhotoPerson = profilePhotoPerson;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public String getTitlePerson() {
        return titlePerson;
    }

    public void setTitlePerson(String titlePerson) {
        this.titlePerson = titlePerson;
    }

    public String getDescriptionPerson() {
        return descriptionPerson;
    }

    public void setDescriptionPerson(String descriptionPerson) {
        this.descriptionPerson = descriptionPerson;
    }

    public String getProfilePhotoPerson() {
        return profilePhotoPerson;
    }

    public void setProfilePhotoPerson(String profilePhotoPerson) {
        this.profilePhotoPerson = profilePhotoPerson;
    }
}
