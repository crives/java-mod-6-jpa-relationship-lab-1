package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "Capitals")
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String name;

    @OneToOne(mappedBy = "capital")
    private Country country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
