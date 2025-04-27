package io.robeel.bhatti.taskFlow.repository;

import io.robeel.bhatti.taskFlow.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}