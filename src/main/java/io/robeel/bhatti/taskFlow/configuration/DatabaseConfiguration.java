package io.robeel.bhatti.taskFlow.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "io.robeel.bhatti.taskFlow.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
}
