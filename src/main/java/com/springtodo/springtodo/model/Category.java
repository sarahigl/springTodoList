package com.springtodo.springtodo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public Category(String label) {
        this.label = label;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", label='" + getLabel() + "'" +
            "}";
    }


}
