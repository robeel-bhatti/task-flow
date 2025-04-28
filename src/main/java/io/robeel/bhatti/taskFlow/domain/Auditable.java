package io.robeel.bhatti.taskFlow.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.Instant;

@MappedSuperclass
public class Auditable {

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "modified_at", nullable = false)
    private Instant modifiedAt;

    @Column(name = "created_by", nullable = false, length = 256)
    private String createdBy;

    @Column(name = "modified_by", nullable = false, length = 256)
    private String modifiedBy;

}
