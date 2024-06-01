package com.lester.geohash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lester.geohash.entity.Subregion;
import com.lester.geohash.service.SubregionService;

import java.util.List;

@RestController
@RequestMapping("/api/subregions")
public class SubregionController {
    @Autowired
    private SubregionService subregionservice;

    @GetMapping
    public List<Subregion> getAllCountries() {
        return subregionservice.findAll();
    }

    @GetMapping("/{id}")
    public Subregion getCountryById(@PathVariable Long id) {
        return subregionservice.findById(id);
    }
}