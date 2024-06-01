package com.lester.geohash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lester.geohash.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {
}