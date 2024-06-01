package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;

import com.lester.geohash.entity.City;
import com.lester.geohash.repository.CityRepository;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public Page<City> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return cityRepository.findAll(pageable);
    }

    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City findByName(String cityName) {
        return cityRepository.findByName(cityName);
    }

    public List<City> searchByName(String cityName) {
        return cityRepository.findByNameContainingIgnoreCase(cityName);
    }
}