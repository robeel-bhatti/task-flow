package io.robeel.bhatti.taskFlow.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "statuses", schema = "task_flow")
public class Status extends Auditable {

    @Id
    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "description", nullable = false, length = 256)
    private String description;

}