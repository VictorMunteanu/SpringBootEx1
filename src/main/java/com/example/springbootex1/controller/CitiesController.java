package com.example.springbootex1.controller;

import com.example.springbootex1.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("")
    public String create(@RequestParam String citiesName){
        return citiesRepository.create(citiesName);
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
    public String update(@PathVariable Integer id, @RequestParam String citiesName){
        return citiesRepository.update(id, citiesName);
    }
}
