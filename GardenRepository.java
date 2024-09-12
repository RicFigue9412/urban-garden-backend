package com.example.urbangarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.urbangarden.model.Garden;

public interface GardenRepository extends JpaRepository<Garden, Long> {
}
