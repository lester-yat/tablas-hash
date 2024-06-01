package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.lester.geohash.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String coutryName);
    List<Country> findByNameContainingIgnoreCase(String countryName);
}