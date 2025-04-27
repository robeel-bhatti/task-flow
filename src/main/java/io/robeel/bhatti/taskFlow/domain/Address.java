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
@Table(name = "addresses", schema = "task_flow")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "street", nullable = false, length = 256)
    private String street;

    @Column(name = "country", nullable = false, length = 3)
    private String country;

    @Column(name = "zip", nullable = false, length = 10)
    private String zip;

    @Column(name = "city", nullable = false, length = 256)
    private String city;

    @Column(name = "state", nullable = false, length = 2)
    private String state;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "modified_at", nullable = false)
    private Instant modifiedAt;

    @Column(name = "created_by", nullable = false, length = 256)
    private String createdBy;

    @Column(name = "modified_by", nullable = false, length = 256)
    private String modifiedBy;

}