package com.covenant.onetomany.repository;

import com.covenant.onetomany.domain.Pocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketRepository extends JpaRepository<Pocket, Long> {
}
