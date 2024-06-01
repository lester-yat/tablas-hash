package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lester.geohash.entity.Region;
import java.util.*;

public interface RegionRepository extends JpaRepository<Region, Long> {
    List<Region> findByNameContainingIgnoreCase(String regionName);
}