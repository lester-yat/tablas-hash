package com.lester.geohash.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lester.geohash.entity.City;
import com.lester.geohash.entity.Country;
import com.lester.geohash.entity.State;
import com.lester.geohash.entity.Region;
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
    public String index(Model model, @RequestParam(defaultValue = "0") Integer currentCityPage, @RequestParam(defaultValue = "0") int cityPageNo, @RequestParam(defaultValue = "0") int countryPageNo, @RequestParam(defaultValue = "0") int statePageNo) {
        int pageSize = 50;
        
        // Aplicar la corrección aquí
        currentCityPage = currentCityPage != null ? currentCityPage : 0;
        model.addAttribute("currentCityPage", currentCityPage);

        Page<City> cityPage = cityService.findPaginated(cityPageNo, pageSize);
        model.addAttribute("cities", cityPage.getContent());
        model.addAttribute("currentCityPage", cityPageNo);
        model.addAttribute("totalCityPages", cityPage.getTotalPages());

        Page<Country> countryPage = countryService.findPaginated(countryPageNo, pageSize);
        model.addAttribute("countries", countryPage.getContent());
        model.addAttribute("currentCountryPage", countryPageNo);
        model.addAttribute("totalCountryPages", countryPage.getTotalPages());

        model.addAttribute("regions", regionService.findAll());
        
        Page<State> statePage = stateService.findPaginated(statePageNo, pageSize);
        model.addAttribute("states", statePage.getContent());
        model.addAttribute("currentStatePage", statePageNo);
        model.addAttribute("totalStatePages", statePage.getTotalPages());

        model.addAttribute("subregions", subregionService.findAll());
        return "index";
    }
    
    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") String searchTerm, Model model) {
        // Search cities
        List<City> cities = cityService.searchByName(searchTerm);
        model.addAttribute("cities", cities);

        // Search countries
        List<Country> countries = countryService.searchByName(searchTerm);
        model.addAttribute("countries", countries);

        // Search regions
        List<Region> regions = regionService.searchByName(searchTerm);
        model.addAttribute("regions", regions);

        // Search states
        List<State> states = stateService.searchByName(searchTerm);
        model.addAttribute("states", states);

        // Search subregions
        List<Subregion> subregions = subregionService.searchByName(searchTerm);
        model.addAttribute("subregions", subregions);

        return "index";
    }
}
