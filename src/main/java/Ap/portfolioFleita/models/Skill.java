package Ap.portfolioFleita.models;

import javax.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "id_skill")
    private Long idSkill;

    @Column(name= "mame_skill", length = 100, nullable = false)
    private String nameSkill;

    @Column(name= "percentage", length = 100, nullable = false)
    private int percentage;

    public Skill() {
    }

    public Skill(Long idSkill, String nameSkill, int percentage) {
        this.idSkill = idSkill;
        this.nameSkill = nameSkill;
        this.percentage = percentage;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
