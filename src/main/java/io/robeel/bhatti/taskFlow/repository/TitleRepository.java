package io.robeel.bhatti.taskFlow.repository;

import io.robeel.bhatti.taskFlow.domain.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, String> {
}