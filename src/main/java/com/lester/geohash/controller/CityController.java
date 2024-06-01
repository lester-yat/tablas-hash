package com.lester.geohash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lester.geohash.entity.City;
import com.lester.geohash.service.CityService;

@Controller
public class CityController {
    
    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String viewCitiesPage(Model model, @RequestParam(defaultValue = "0") int pageNo) {
        int pageSize = 50;  // Número de registros por página

        Page<City> page = cityService.findPaginated(pageNo, pageSize);
        model.addAttribute("cities", page.getContent());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        
        return "index";
    }
}