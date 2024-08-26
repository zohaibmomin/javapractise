package com.stream.app.spring_streaming_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="yt_courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    private String courseId;
    private String title;
    private String description;

    @OneToMany(mappedBy = "course")
    private List<Video> list = new ArrayList<>();
}
