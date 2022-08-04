package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String name;

    @OneToOne
    private Capital capital;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}
