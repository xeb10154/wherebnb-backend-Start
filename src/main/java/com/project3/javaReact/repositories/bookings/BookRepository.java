package com.project3.javaReact.repositories.bookings;


import com.project3.javaReact.models.Booking;
import com.project3.javaReact.projections.EmbedForBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForBook.class)
public interface BookRepository extends JpaRepository<Booking, Long> {

}

