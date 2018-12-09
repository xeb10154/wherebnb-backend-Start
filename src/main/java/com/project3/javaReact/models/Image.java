package com.project3.javaReact.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Image {

    @Column(name = "paths")
    private List<String> paths;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Image(List<String> paths) {
        this.paths = paths;

    }

    public Image() {
    }

    public List<String> getPath() {
        return paths;
    }

    public void setPath(List<String> paths) {
        this.paths = paths;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
