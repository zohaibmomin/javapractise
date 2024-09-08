package com.stream.app.spring_streaming_backend.services.impl;

import com.stream.app.spring_streaming_backend.entities.Video;
import com.stream.app.spring_streaming_backend.repositories.VideoRepository;
import com.stream.app.spring_streaming_backend.services.VideoService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class VideoServiceImplementation implements VideoService {
    @Value("${files.video}")
    String DIR;

    @Autowired
    private VideoRepository videoRepository;

    @PostConstruct
    public void init() {
        File file = new File(DIR);

        //if folder doesnt exist then create
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder created!");
        } else {
            System.out.println("Folder already present!");
        }
    }

    @Override
    public Video save(Video video, MultipartFile file) {

        try {
            //original Filename
            String ogFilename = file.getOriginalFilename();
            String contentType = file.getContentType();
            InputStream inputStream = file.getInputStream();

            //folder path :create
            String cleanFileName = StringUtils.cleanPath(ogFilename);
            String cleanFolder = StringUtils.cleanPath(DIR);

            Path path = Paths.get(cleanFolder, cleanFileName);
            System.out.println(path);
            System.out.println(contentType);

            //copy file to folder
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);

            //video meta data
            video.setContentType(contentType);
            video.setFilePath(path.toString());

            //save metadata
            return videoRepository.save(video);

        } catch (IOException e) {
            e.printStackTrace();
        }
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
