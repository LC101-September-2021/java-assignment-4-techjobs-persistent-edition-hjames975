package org.launchcode.techjobs.persistent.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 0, max = 1000)
    private String description;

    public Skill(){}

//    public Skill(int id, String description){
//        super();
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}