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

    public String read(Integer id){
        try{
            return id + ":" + this.cities.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.cities.toString();
    }

    public String update(Integer id, String citiesName){
        try{
            this.cities.set(id, citiesName);
            return "Cities updated";
        } catch (Exception exception){
            return "Not found";
        }
    }
}
