package com.covenant.springbootmysql.repository;

import com.covenant.springbootmysql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}