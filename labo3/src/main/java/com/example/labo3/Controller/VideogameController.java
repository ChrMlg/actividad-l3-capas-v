package com.example.labo3.Controller;

import com.example.labo3.Service.ServiceImplementation.VideogameServiceImpl;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.GenericResponse;
import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogame")
@RequiredArgsConstructor
public class VideogameController {
    private final iVideogameService videogameService;

    @GetMapping
    public ResponseEntity<List<VideoGameResponse>> getAllVideogames() throws Exception {
        List<VideoGameResponse> videogames = videogameService.getAllVideogames();
        return ResponseEntity.ok(videogames);
    }

    @PostMapping("/create")
    public ResponseEntity<GenericResponse> createVideogame(
            @RequestBody @Valid VideoGameRequest object) throws Exception {

        VideoGameResponse data = videogameService.createVideogame(object);

        return GenericResponse.builder()
                .message("Videojuego creado exitosamente")
                .data(data)
                .status(HttpStatus.OK)
                .build()
                .buildResponse();
    }
/*
    @PostMapping
    public ResponseEntity<VideoGameResponse> createVideogame(@RequestBody Videogame videogame) throws Exception {
        VideoGameResponse createdVideogame = videogameServiceImpl.createVideogame(videogame);
        return ResponseEntity.ok(createdVideogame);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideoGameResponse> getVideogameById(@PathVariable Integer id) throws Exception {
        VideoGameResponse videogame = videogameServiceImpl.getVideogameById(id);
        return ResponseEntity.ok(videogame);
    }

    // Uncomment and implement the following methods if needed }

   /* @PostMapping("/save")
    public Videogame getVideogame(@RequestBody Videogame videogame) {
        return videogameService.save(videogame);
    }

    @GetMapping("/{id}")
    public Videogame getVideogameById2(@PathVariable int id) {
        return VideogameService.findById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideoGameResponse> getVideogameById(@PathVariable int id) {
        VideoGameResponse videogame = videogameServiceImpl.getVideogameById(id);
    }*/



}
