package com.baeldung.taskmanagementapplesson.persistence.repository.impl;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProjectRepositoryImpl implements IProjectRepository {

    private List<Project> projects = new ArrayList<>();

    public ProjectRepositoryImpl() {
        super();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);
        if (existingProject == null) {
            projects.add(project);
        } else {
            projects.remove(existingProject);
            Project newProject = new Project(project);
            projects.add(newProject);
        }
        return project;
    }

}