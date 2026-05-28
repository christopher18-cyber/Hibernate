package com.genius;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {
    private String firstName;
    private String lastName;

    AlienName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AlienName() {

    }
}