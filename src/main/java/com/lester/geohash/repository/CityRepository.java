package com.lester.geohash.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.lester.geohash.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT c FROM City c WHERE c.created_at IS NOT NULL")
    List<City> findAllCities();
    
    // Agrega este método para buscar una ciudad por su nombre
    City findByName(String cityName);
}
