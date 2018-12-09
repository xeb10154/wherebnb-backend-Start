package com.project3.javaReact.repositories.users;

import com.project3.javaReact.models.User;
import com.project3.javaReact.projections.EmbedForUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForUser.class)
public interface UserRepository extends JpaRepository<User, Long> {

}


