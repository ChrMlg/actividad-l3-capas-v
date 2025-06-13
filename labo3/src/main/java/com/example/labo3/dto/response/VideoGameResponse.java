package com.example.labo3.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoGameResponse {
    private Integer id;
    private String name;
    private String genre;
    private int releaseYear;
    private String developer;
}
