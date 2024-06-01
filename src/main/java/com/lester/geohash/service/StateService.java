package com.lester.geohash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lester.geohash.entity.State;
import com.lester.geohash.repository.StateRepository;
import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll() {
        return stateRepository.findAll();
    }
    
    public State findById(Long id) {
        return stateRepository.findById(id).orElse(null);
    }
}