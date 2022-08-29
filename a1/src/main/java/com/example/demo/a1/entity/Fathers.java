package com.example.demo.a1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "FATHER")
public class Fathers {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fathers fathers = (Fathers) o;
        return Objects.equals(id, fathers.id) &&
                Objects.equals(name, fathers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}