package com.example.urbangarden.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gardens")
public class Garden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String plantTypes;
    private int size;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
