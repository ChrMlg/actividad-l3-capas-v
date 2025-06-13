package com.example.labo3.Controller;

import com.example.labo3.Service.ServiceImplementation.VideogameServiceImpl;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.entities.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogame")
public class VideogameController {
    private iVideogameService VideogameService;
    @Autowired
    public VideogameController(VideogameService videogameService) {
        this.videogameService = videogameService;
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




}
