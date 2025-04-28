package io.robeel.bhatti.taskFlow.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees", schema = "task_flow")
public class Employee extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 256)
    private String name;

    @Column(name = "address_id", nullable = false)
    private Long addressId;

    @Column(name = "manager_id")
    private Long managerId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "team")
    private String team;

}