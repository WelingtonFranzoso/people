package com.franzoso.people.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "social_security_number", nullable = false, unique = true)
    private String socialSecurityNumber;

    @Column(name = "age", nullable = false)
    private Integer age;

}