package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lester.geohash.entity.Region;
import com.lester.geohash.repository.RegionRepository;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> findAll() {
        return regionRepository.findAll();
    }
    
    public Region findById(Long id) {
        return regionRepository.findById(id).orElse(null);
    }
}