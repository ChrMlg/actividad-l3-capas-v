package com.example.labo3.Service.ServiceImplementation;

import com.example.labo3.Repository.VideogameRepository;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.entities.VideoGame;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VideogameServiceImpl implements iVideogameService {
    private final VideogameRepository videogameRepository;
    @Override
    public VideoGameResponse createVideogame(VideoGameRequest dto) throws Exception {

        VideoGame videogame = VideoGame.builder()
                .name(dto.getName())
                .genre(dto.getGenre())
                .releaseYear(dto.getReleaseYear())
                .developer(dto.getDeveloper())
                .build();

        // 1) Guarda primero
        VideoGame saved = videogameRepository.save(videogame);

        // 2) Mapea sobre el objeto ya persistido
        return mapToVideoGameResponse(saved);

    }

    @Override
    public VideoGameResponse getVideogameById(UUID idVideogame) throws Exception {
        VideoGame toSend = videogameRepository
                .findById(idVideogame)
                .orElseThrow(() -> new Exception("Videojuego con id " + idVideogame + " no existe"));
        return mapToVideoGameResponse(toSend);
    }


    @Override
    public List<VideoGameResponse> getAllVideogames() {
        return videogameRepository.findAll()
                .stream()
                .map(this::mapToVideoGameResponse)
                .collect(Collectors.toList());
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
