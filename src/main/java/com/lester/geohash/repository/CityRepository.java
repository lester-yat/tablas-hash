package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.lester.geohash.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByName(String cityName);
    List<City> findByNameContainingIgnoreCase(String cityName);
}
