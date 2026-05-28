package com.genius;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Alien {
    @Id
    private int id;
    private AlienName name;
//    @Column(name = "tech_stack")
    private String tech;
    @Transient
    private String fullname;

    public Alien(int id, AlienName name, String tech){
        this.id = id;
        this.name = name;
        this.tech = tech;
//        this.fullname = name;
    }

    public Alien() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AlienName getName() {
        return name;
    }

    public void setName(AlienName name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
