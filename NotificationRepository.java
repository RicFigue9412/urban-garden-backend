package com.example.urbangarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.urbangarden.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
