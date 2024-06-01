package com.lester.geohash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lester.geohash.entity.State;
import com.lester.geohash.service.StateService;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping
    public List<State> getAllStates() {
        return stateService.findAll();
    }

    @GetMapping("/{id}")
    public State getStateById(@PathVariable Long id) {
        return stateService.findById(id);
    }
}