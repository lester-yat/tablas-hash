package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lester.geohash.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
}