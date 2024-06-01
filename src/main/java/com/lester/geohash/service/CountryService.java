package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lester.geohash.entity.Country;
import com.lester.geohash.repository.CountryRepository;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }
    
    public Country findById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}