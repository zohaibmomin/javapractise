package com.stream.app.spring_streaming_backend.services;

import com.stream.app.spring_streaming_backend.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {

    //save Video
    Video save(Video video, MultipartFile file);

    //get video by id
    Video get(String videoId);

    //get video by title
    Video getByTitle(String title);

    //get all videos
    List<Video> getAll();
}
