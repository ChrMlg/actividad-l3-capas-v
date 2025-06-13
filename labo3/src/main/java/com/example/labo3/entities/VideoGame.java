package com.example.labo3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "videogames")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideoGame {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String genre;
    @Column(name = "release_year")
    private int releaseYear;
    private String developer;
}
