package io.robeel.bhatti.taskFlow.repository;

import io.robeel.bhatti.taskFlow.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}