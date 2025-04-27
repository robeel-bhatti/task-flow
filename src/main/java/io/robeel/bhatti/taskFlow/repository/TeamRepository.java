package io.robeel.bhatti.taskFlow.repository;

import io.robeel.bhatti.taskFlow.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {
}