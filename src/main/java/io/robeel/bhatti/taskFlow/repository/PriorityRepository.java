package io.robeel.bhatti.taskFlow.repository;

import io.robeel.bhatti.taskFlow.domain.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<Priority, String> {
}