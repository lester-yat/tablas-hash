package com.lester.geohash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lester.geohash.entity.Country;
import com.lester.geohash.service.CountryService;

@Controller
public class CountryController {
    
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String viewCountriesPage(Model model, @RequestParam(defaultValue = "0") int pageNo) {
        int pageSize = 50;  // Número de registros por página

        Page<Country> page = countryService.findPaginated(pageNo, pageSize);
        model.addAttribute("countries", page.getContent());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        
        return "index";
    }
}