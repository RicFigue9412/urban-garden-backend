package com.example.urbangarden.controller;

import com.example.urbangarden.model.Garden;
import com.example.urbangarden.service.GardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gardens")
public class GardenController {
    @Autowired
    private GardenService gardenService;

    @GetMapping
    public List<Garden> getAllGardens() {
        return gardenService.getAllGardens();
    }

    @PostMapping
    public Garden createGarden(@RequestBody Garden garden) {
        return gardenService.createGarden(garden);
    }

    @GetMapping("/{id}")
    public Garden getGardenById(@PathVariable Long id) {
        return gardenService.getGardenById(id);
    }
}
