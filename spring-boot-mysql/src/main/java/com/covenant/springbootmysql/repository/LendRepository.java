package com.covenant.springbootmysql.repository;

import com.covenant.springbootmysql.model.Book;
import com.covenant.springbootmysql.model.Lend;
import com.covenant.springbootmysql.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}