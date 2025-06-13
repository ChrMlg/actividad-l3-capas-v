package com.example.labo3.Service;

import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;

import java.util.List;

public interface iVideogameService {

    VideoGameResponse createVideogame(VideoGameRequest dto) throws Exception;
    VideoGameResponse getVideogameById(Integer idVideojuego) throws Exception;
    List<VideoGameResponse> getAllVideogames() throws Exception;

}
