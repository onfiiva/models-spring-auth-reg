package com.example.springmodels.models;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "habitant")
public class Habitant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @ManyToMany
    @JoinTable(
            name = "house_habitant",
            joinColumns = @JoinColumn(name = "house_id"),
            inverseJoinColumns = @JoinColumn(name = "habitant_id")
    )
    private List<Habitant> habitants;
}
