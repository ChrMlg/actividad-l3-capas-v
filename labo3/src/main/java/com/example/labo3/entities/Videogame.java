package com.example.labo3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videogames")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Videogame {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String genre;
    @Column(name = "release_year")
    private String releaseYear;
    private String developer;
}
