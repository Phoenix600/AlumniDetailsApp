package com.s2pedutech.Alumini.entity;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.List;


@Setter
@Entity
@Table(name = "States")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    private String name;

//    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<City> city;


    public State() {
    }

    public State(long id, Country country, String name ) {
        this.id = id;
        this.country = country;
        this.name = name;
//        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountries() {
        return country;
    }

    public void setCountries(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<City> getCity() {
//        return city;
//    }
//
//    public void setCity(List<City> city) {
//        this.city = city;
//    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", countries=" + country +
                ", name='" + name + '\'' +
//                ", city=" + city +
                '}';
    }
}
