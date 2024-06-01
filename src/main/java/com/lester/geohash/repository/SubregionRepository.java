package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lester.geohash.entity.Subregion;
import java.util.*;

public interface SubregionRepository extends JpaRepository<Subregion, Long> {
    List<Subregion> findByNameContainingIgnoreCase(String subregionName);
}