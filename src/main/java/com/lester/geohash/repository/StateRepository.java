package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.lester.geohash.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    State findByName(String staeName);
    List<State> findByNameContainingIgnoreCase(String stateName);
}
