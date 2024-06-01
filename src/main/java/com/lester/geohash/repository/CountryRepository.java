package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lester.geohash.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}