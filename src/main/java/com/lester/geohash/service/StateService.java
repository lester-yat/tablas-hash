package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;

import com.lester.geohash.entity.State;
import com.lester.geohash.repository.StateRepository;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public Page<State> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return stateRepository.findAll(pageable);
    }

    public State findById(Long id) {
        return stateRepository.findById(id).orElse(null);
    }

    public State findByName(String stateName) {
        return stateRepository.findByName(stateName);
    }

    public List<State> searchByName(String stateName) {
        return stateRepository.findByNameContainingIgnoreCase(stateName);
    }
}