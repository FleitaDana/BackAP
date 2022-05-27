package Ap.portfolioFleita.models;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "id_project")
    private Long idProject;

    @Column(name= "title_project", length = 100, nullable = false)
    private String titleProject;

    @Column(name= "description_project", length = 200, nullable = false)
    private String descriptionProject;

    @Column(name= "photo_project", length = 100, nullable = false)
    private String photoProject;

    @Column(name= "link_project", length = 100, nullable = false)
    private String linkProject;

    public Project() {
    }

    public Project(Long idProject, String titleProject, String descriptionProject, String photoProject, String linkProject) {
        this.idProject = idProject;
        this.titleProject = titleProject;
        this.descriptionProject = descriptionProject;
        this.photoProject = photoProject;
        this.linkProject = linkProject;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }

    public String getPhotoProject() {
        return photoProject;
    }

    public void setPhotoProject(String photoProject) {
        this.photoProject = photoProject;
    }

    public String getLinkProject() {
        return linkProject;
    }

    public void setLinkProject(String linkProject) {
        this.linkProject = linkProject;
    }
}
