package com.project3.javaReact.repositories.properties;

import com.project3.javaReact.models.Property;
import com.project3.javaReact.projections.EmbedForProp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForProp.class)
public interface PropRepository extends JpaRepository<Property, Long> {
}
