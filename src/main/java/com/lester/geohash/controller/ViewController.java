package com.lester.geohash.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lester.geohash.entity.City;
import com.lester.geohash.entity.Country;
import com.lester.geohash.entity.Region;
import com.lester.geohash.entity.State;
import com.lester.geohash.entity.Subregion;
import com.lester.geohash.service.CityService;
import com.lester.geohash.service.CountryService;
import com.lester.geohash.service.RegionService;
import com.lester.geohash.service.StateService;
import com.lester.geohash.service.SubregionService;

@Controller
public class ViewController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private StateService stateService;

    @Autowired
    private SubregionService subregionService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("regions", regionService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("subregions", subregionService.findAll());
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam("cityName") String cityName, Model model) {
        City city = cityService.findByName(cityName);
        model.addAttribute("cities", Collections.singletonList(city));
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("regions", regionService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("subregions", subregionService.findAll());
        return "index";
    }
}
