package com.lester.geohash.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lester.geohash.entity.City;
import com.lester.geohash.repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }
    
    public List<City> findAllCities() {
        return cityRepository.findAllCities(); // Método agregado para obtener todas las ciudades
    }
    
    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City findByName(String cityName) {
        return cityRepository.findByName(cityName);
    }
}