package com.franzoso.people.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequestDTO {

    private String name;
    private String socialSecurityNumber;
    private Integer age;

}
