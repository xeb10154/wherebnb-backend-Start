package com.project3.javaReact.projections;

import com.project3.javaReact.models.Experience;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedForExp", types = Experience.class)
public interface EmbedForExp {

        long getId();
        String getLocation();
        String getCategory();
        String getDescription();
        Double getPrice();
        Date getDate();

}
