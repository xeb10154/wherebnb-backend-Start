package com.project3.javaReact.projections;

import com.project3.javaReact.models.Property;
import com.project3.javaReact.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedForUser", types = User.class)
public interface EmbedForUser {

    long getId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPassword();
    ArrayList<Property> getBookings();
}
