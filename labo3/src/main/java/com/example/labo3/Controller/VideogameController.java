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
import java.util.UUID;

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

 /*   @PostMapping("/create")
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

@GetMapping("/{idVideogame}")
public ResponseEntity<GenericResponse> getVideogameById(
        @PathVariable("idVideogame") UUID idVideogame) throws Exception {

    VideoGameResponse data = videogameService.getVideogameById(idVideogame);
    return GenericResponse.builder()
            .message("Videojuego encontrado exitosamente")
            .data(data)
            .status(HttpStatus.OK)
            .build()
            .buildResponse();
}
*/



}
