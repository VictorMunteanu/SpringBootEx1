package com.example.springbootex1.repository;

import java.util.ArrayList;

public class CitiesRepository {
    ArrayList<String> cities = new ArrayList<>();

    public CitiesRepository(){
        this.cities.add("Balti");
        this.cities.add("Chisinau");
        this.cities.add("Soroca");
        this.cities.add("Tiraspol");
    }

    public String create(String citiesName){
        this.cities.add(citiesName);
        return "Create Cities";
    }
}
