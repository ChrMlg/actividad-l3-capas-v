package com.example.labo3.Service.ServiceImplementation;

import com.example.labo3.Repository.VideogameRepository;
import com.example.labo3.Service.iVideogameService;
import com.example.labo3.dto.request.VideoGameRequest;
import com.example.labo3.dto.response.VideoGameResponse;
import com.example.labo3.exception.VideoGameNotFoundException;
import com.example.labo3.utils.mappers.VideoGameMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameServiceImpl implements iVideogameService {
    private final VideogameRepository videogameRepository;

    @Autowired
    public VideogameServiceImpl(VideogameRepository videogameRepository) {
        this.videogameRepository = videogameRepository;
    }

    @Override
    public List<VideoGameResponse> findAll() {
        return VideoGameMapper.toDTOList(videogameRepository.findAll());
    }

    @Override
    public VideoGameResponse findById(int id) {
        return VideoGameMapper.toDTO(videogameRepository.findById(id)
                        .orElseThrow(() -> new VideoGameNotFoundException("Video game not found with id: " + id))
        );
    }

    @Override
    @Transactional
    public VideoGameResponse save(VideoGameRequest videoGame) {
        return VideoGameMapper.toDTO(videogameRepository.save(VideoGameMapper.toEntityCreate(videoGame))
        );
    }

    @Override
    @Transactional
    public VideoGameResponse update(VideoGameRequest videoGame) {
        return VideoGameMapper.toDTO(videogameRepository.save(VideoGameMapper.toEntityCreate(videoGame))
        );
    }

    @Override
    public void delete(int id) {
        if (!videogameRepository.existsById(id)) {
            throw new RuntimeException("Video game not found with id: " + id);
        }
        videogameRepository.deleteById(id);
    }
}
