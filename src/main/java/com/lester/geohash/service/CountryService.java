package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.*;

import com.lester.geohash.entity.Country;
import com.lester.geohash.repository.CountryRepository;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> findPaginated(int pageNo, int pageSize) {
        PageRequest pageable = PageRequest.of(pageNo, pageSize);
        return countryRepository.findAll(pageable);
    }

    public Country findById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country findByName(String countryName) {
        return countryRepository.findByName(countryName);
    }

    public List<Country> searchByName(String countryName) {
        return countryRepository.findByNameContainingIgnoreCase(countryName);
    }
}
