package com.stream.app.spring_streaming_backend.repositories;

import com.stream.app.spring_streaming_backend.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, String> {

    Optional<Video> findByTitle(String title);

    //query methods

    //native

    //criteria apis
}
