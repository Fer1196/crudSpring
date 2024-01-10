package com.libros.libros.Pet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    String name;
    String type;
    @Column (unique = true)
    String email;
    Number age;


    public Pet() {
    }


    public Pet(Long id, String name, String type, String email, Number age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.age = age;
    }


    public Pet(String name, String type, String email, Number age) {
        this.name = name;
        this.type = type;
        this.email = email;
        this.age = age;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Number getAge() {
        return age;
    }


    public void setAge(Number age) {
        this.age = age;
    }

    
    
}
