package com.example.labo3.Controller;

import com.example.labo3.Service.ServiceImplementation.VideogameServiceImpl;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.entities.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogame")
public class VideogameController {
    private final VideogameServiceImpl videogameServiceImpl;
    private iVideogameService VideogameService;
    @Autowired
    public VideogameController(VideogameService videogameService, VideogameServiceImpl videogameServiceImpl) {
        this.videogameService = videogameService;
        this.videogameServiceImpl = videogameServiceImpl;
    }

    @GetMapping
    public List<VideoGameResponse> getAllVideogames() throws Exception {
        return VideogameService.getAllVideogames();
    }

    @PostMapping("/save")
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
    }



}
