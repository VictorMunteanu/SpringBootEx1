package com.example.springbootex1.model;

public class City {
    private Integer id = null;
    private String name = null;

    private Integer countryId = null;
    private String countryName;
    public static Integer autoincrementId = 0;

    City(String cityName, String countryName){

    }

    public City(String name, Integer countryId, String countryName){
        City.autoincrementId++;
        this.id = City.autoincrementId;
        this.name = name;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = Country.autoincrementId;
    }

    //todo

    public String getCountyName(){
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
