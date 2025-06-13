package com.example.labo3.Controller;

import com.example.labo3.entities.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogame")
public class VideogameController {
    @Autowired
    public VideogameController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @GetMapping()
    public List<Videogame> getVideogame() {
        return videogameService.findAll();
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
