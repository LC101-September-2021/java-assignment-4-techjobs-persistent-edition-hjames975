package org.launchcode.techjobs.persistent.models;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(min = 1, max = 100, message = "Location must be between 1 and 100 characters long")
    public String location;

    public Employer(){}

//    public Employer(int id, String location){
//        super();
//        this.id = id;
//        this.location = location;
//    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
