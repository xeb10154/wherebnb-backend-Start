package com.project3.javaReact.projections;

import com.project3.javaReact.models.Booking;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedForBook", types = Booking.class)
public interface EmbedForBook{

    long getUserId();
    long getPropertyId();
    Date getStartDate();
    Date getEndDate();

}
