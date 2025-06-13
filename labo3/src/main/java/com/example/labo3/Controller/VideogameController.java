package com.example.labo3.Controller;

import com.example.labo3.Service.ServiceImplementation.VideogameServiceImpl;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.GeneralResponse;
import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.exception.VideoGameNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/videogame")
public class VideogameController {
    private iVideogameService VideogameService;

    @Autowired
    public VideogameController(VideogameServiceImpl videogameService) {
        this.VideogameService = videogameService;
    }

    @GetMapping("/all")
    public ResponseEntity<GeneralResponse> getAllVideogames(){
        List<VideoGameResponse> videogames = VideogameService.findAll();
        if (videogames.isEmpty()) {
            throw new VideoGameNotFoundException("No video games found");
        }
        return buildResponse("Video games found!", HttpStatus.OK, videogames);
    }

    @PostMapping("/save")
    public ResponseEntity<GeneralResponse> saveVideogame(@RequestBody @Valid VideoGameRequest videogame) {
        return buildResponse("Video game created!", HttpStatus.CREATED, VideogameService.save(videogame));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralResponse> getVideogameById(@PathVariable int id) {
        VideoGameResponse videogame = VideogameService.findById(id);
        return buildResponse("Video game found!", HttpStatus.OK, videogame);
    }

    public ResponseEntity<GeneralResponse> buildResponse(String message, HttpStatus status, Object data) {
        String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().build().getPath();
        return ResponseEntity.status(status).body(GeneralResponse.builder()
                .message(message)
                .status(status.value())
                .data(data)
                .uri(uri)
                .time(LocalDate.now())
                .build());
    }
}
