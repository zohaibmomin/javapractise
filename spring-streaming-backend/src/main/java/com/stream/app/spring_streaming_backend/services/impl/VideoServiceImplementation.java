package com.stream.app.spring_streaming_backend.services.impl;

import com.stream.app.spring_streaming_backend.entities.Video;
import com.stream.app.spring_streaming_backend.services.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class VideoServiceImplementation implements VideoService {
    @Override
    public Video save(Video video, MultipartFile file) {
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return List.of();
    }
}
