package com.stream.app.spring_streaming_backend.controllers;

import com.stream.app.spring_streaming_backend.entities.Video;
import com.stream.app.spring_streaming_backend.payload.CustomMessage;
import com.stream.app.spring_streaming_backend.services.VideoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/videos")
public class VideoController {

    private VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping
    public ResponseEntity<?> create(
            @RequestParam("file") MultipartFile file,
            @RequestParam("title") String title,
            @RequestParam("description") String description
    ) {
        Video video = new Video();
        video.setVideoId(UUID.randomUUID().toString());
        video.setTitle(title);
        video.setDescription(description);

        Video savedVideo = videoService.save(video, file);

        if(savedVideo!=null){
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(video);
        }else{
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(CustomMessage.builder()
                            .message("Video not uploaded")
                            .success(false)
                            .build()
                    );
        }
//        return null;
    }
}
