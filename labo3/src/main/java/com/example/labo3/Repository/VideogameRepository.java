package com.example.labo3.Repository;

import com.example.labo3.entities.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VideogameRepository extends JpaRepository<VideoGame, UUID> {
}
