package io.robeel.bhatti.taskFlow.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "addresses", schema = "task_flow")
public class Address extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
}