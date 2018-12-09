package com.project3.javaReact.repositories.experiences;

import com.project3.javaReact.models.Experience;
import com.project3.javaReact.projections.EmbedForExp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForExp.class)
public interface ExpRepository extends JpaRepository<Experience, Long> {

}

