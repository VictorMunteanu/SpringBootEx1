package com.example.springbootex1.controller;

import com.example.springbootex1.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("cities")
    public String create(@RequestParam String cityName, @RequestParam Integer countryId, @RequestParam String countryName) {
        return citiesRepository.create(cityName, countryId, countryName);
    }

    @GetMapping("cities/{id}")
    public String read(@PathVariable Integer id){
        return citiesRepository.read(id);
    }

    @GetMapping("cities")
    public String readAll(){
        return citiesRepository.readAll();
    }

    @PutMapping("cities/{id}")
    public String update(@PathVariable Integer id, @RequestParam String cityName, @RequestParam String countryName){
        return citiesRepository.update(id, cityName, countryName);
    }

    @DeleteMapping("cities/{id}")
    public String delete(@PathVariable Integer id){
        return citiesRepository.delete(id);
    }
}