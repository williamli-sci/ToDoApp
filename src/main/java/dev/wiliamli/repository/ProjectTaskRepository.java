package dev.wiliamli.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.wiliamli.domain.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    ProjectTask getById(Long id);
}
