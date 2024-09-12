package com.example.urbangarden.service;

import com.example.urbangarden.model.Garden;
import com.example.urbangarden.repository.GardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardenService {
    @Autowired
    private GardenRepository gardenRepository;

    public List<Garden> getAllGardens() {
        return gardenRepository.findAll();
    }

    public Garden createGarden(Garden garden) {
        return gardenRepository.save(garden);
    }

    public Garden getGardenById(Long id) {
        return gardenRepository.findById(id).orElse(null);
    }
}
