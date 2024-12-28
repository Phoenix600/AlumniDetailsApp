package com.s2pedutech.Alumini.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

//    @OneToMany(mappedBy = "countries", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<State> states;

    public Country() {
    }

    public Country(long id, String name) {
        this.id = id;
        this.name = name;
//        this.states = states;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<State> getStates() {
//        return states;
//    }
//
//    public void setStates(List<State> states) {
//        this.states = states;
//    }

    @Override
    public String toString() {
        return "Countries{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", states=" + states +
                '}';
    }
}
