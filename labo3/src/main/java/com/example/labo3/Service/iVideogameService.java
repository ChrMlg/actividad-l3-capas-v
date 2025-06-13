package com.example.labo3.Service;

import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;

public interface iVideogameService {

    VideoGameResponse createVideogame(VideoGameRequest dto) throws Exception;
    VideoGameResponse getVideogameById(Long idVideojuego) throws Exception;
    VideoGameResponse getAllVideogames() throws Exception;

}
