package com.lester.geohash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lester.geohash.entity.Region;
import com.lester.geohash.service.RegionService;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {
    @Autowired
    private RegionService regionservice;

    @GetMapping
    public List<Region> getAllCountries() {
        return regionservice.findAll();
    }

    @GetMapping("/{id}")
    public Region getCountryById(@PathVariable Long id) {
        return regionservice.findById(id);
    }
}