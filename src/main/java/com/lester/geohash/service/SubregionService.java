package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lester.geohash.entity.Subregion;
import com.lester.geohash.repository.SubregionRepository;

import java.util.*;

@Service
public class SubregionService {
    @Autowired
    private SubregionRepository subregionRepository;

    public List<Subregion> findAll() {
        return subregionRepository.findAll();
    }
    
    public Subregion findById(Long id) {
        return subregionRepository.findById(id).orElse(null);
    }

    public List<Subregion> searchByName(String subregionName) {
        return subregionRepository.findByNameContainingIgnoreCase(subregionName);
    }
}