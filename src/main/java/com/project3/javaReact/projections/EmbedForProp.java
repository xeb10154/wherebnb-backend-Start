package com.project3.javaReact.projections;

import com.project3.javaReact.models.Property;
import com.project3.javaReact.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedForProp", types = Property.class)
public interface EmbedForProp {

    long getId();
    int getBeds();
    double getprice();
    String getType();
    double getRating();
    double getLon();
    double getLat();
    ArrayList<String> getImages();
    ArrayList<User> getUsers();
}