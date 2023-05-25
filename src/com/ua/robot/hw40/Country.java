package com.ua.robot.hw40;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "country")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<City> cities;

    public Country() {

    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        StringBuilder allCities = new StringBuilder();
        if(cities == null) {
            return "Country [" + id + " " + name + "]";
        }
        for (City o : cities) {
            allCities.append(o.getName()).append(" ");
        }
        return "Country [" + id + " " + name + " Cities: " + allCities + "]";
    }
}
