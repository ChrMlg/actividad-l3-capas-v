package com.example.labo3.Service.ServiceImplementation;

import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.entities.VideoGame;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideogameServiceImpl implements iVideogameService {
    private final iVideogameService iVideogameService;

    @Override
    public VideoGameResponse createVideogame(VideoGameRequest dto) throws Exception {
        VideoGame videogame = new VideoGame();
        videogame.setName(dto.getName());
        videogame.setGenre(dto.getGenre());
        videogame.setReleaseYear(dto.getReleaseYear());
        videogame.setDeveloper(dto.getDeveloper());

        return mapToVideoGameResponse(videogame);

    }

    @Override
    public VideoGameResponse getVideogameById(Long idVideojuego) throws Exception {
        return null;
    }

    @Override
    public VideoGameResponse getAllVideogames() throws Exception {
        return null;
    }

    private VideoGameResponse mapToVideoGameResponse(VideoGame videogame) {
        return new VideoGameResponse(
            videogame.getId(),
            videogame.getName(),
            videogame.getGenre(),
            videogame.getReleaseYear(),
            videogame.getDeveloper()
        );
    }
}
