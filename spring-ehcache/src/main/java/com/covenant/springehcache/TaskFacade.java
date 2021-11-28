package com.covenant.springehcache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskFacade {

    @Cacheable("tasks") // Add this
    public List<TaskDTO> findAll() {
        log.info("Retrieving tasks");
        return List.of(
                new TaskDTO(1L, "My first task", true),
                new TaskDTO(2L, "My second task", false));
    }
}
