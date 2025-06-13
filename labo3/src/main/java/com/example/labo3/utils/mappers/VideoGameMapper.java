package com.example.labo3.utils.mappers;

import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.entities.VideoGame;

import java.util.List;

public class VideoGameMapper {
    public static VideoGame toEntityCreate(VideoGameRequest videoGame) {
        return VideoGame.builder()
                .name(videoGame.getName())
                .genre(videoGame.getGenre())
                .releaseYear(videoGame.getReleaseYear())
                .developer(videoGame.getDeveloper())
                .build();
    }

    public static VideoGameResponse toDTO(VideoGame videoGame) {
        return VideoGameResponse.builder()
                .id(videoGame.getId())
                .name(videoGame.getName())
                .genre(videoGame.getGenre())
                .releaseYear(videoGame.getReleaseYear())
                .developer(videoGame.getDeveloper())
                .build();
    }

    public static List<VideoGameResponse> toDTOList(List<VideoGame> videoGames) {
        return videoGames.stream()
                .map(VideoGameMapper::toDTO)
                .toList();
    }
}
