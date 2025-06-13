package com.example.labo3.Service;

import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;

import java.util.List;

public interface iVideogameService {
    List<VideoGameResponse> findAll();
    VideoGameResponse findById(int id);
    VideoGameResponse save(VideoGameRequest videoGame);
    VideoGameResponse update(VideoGameRequest videoGame);
    void delete(int id);
}
