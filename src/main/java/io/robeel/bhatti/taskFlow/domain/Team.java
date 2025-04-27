package io.robeel.bhatti.taskFlow.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "teams", schema = "task_flow")
public class Team {
    @Id
    @Column(name = "team", nullable = false, length = 20)
    private String team;

    @Column(name = "description", nullable = false, length = 256)
    private String description;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "modified_at", nullable = false)
    private Instant modifiedAt;

    @Column(name = "created_by", nullable = false, length = 256)
    private String createdBy;

    @Column(name = "modified_by", nullable = false, length = 256)
    private String modifiedBy;

}