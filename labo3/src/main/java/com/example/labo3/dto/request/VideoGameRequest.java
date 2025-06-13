package com.example.labo3.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VideoGameRequest {
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotNull(message = "Genre cannot be null")
    private String genre;
    @NotNull(message = "Release year cannot be null")
    private int releaseYear;
    @NotNull(message = "Developer cannot be null")
    private String developer;
}
