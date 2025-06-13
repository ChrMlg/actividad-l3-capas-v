package com.example.labo3.Service;

public interface iVideogameService {

    VideojuegoResponseDTO createVideojuego(CreateVideojuegoDTO dto) throws Exception;
    VideojuegoResponseDTO getVideojuegoById(Long idVideojuego) throws Exception;
    VideojuegoResponseDTO getAllVideojuegos() throws Exception;

}
