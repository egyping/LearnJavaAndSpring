package com.baeldung.taskmanagementapplesson.service;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
