package com.covenant.springehcache;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskFacade taskFacade;

    @GetMapping
    public List<TaskDTO> findAll() {
        return taskFacade.findAll();
    }
}