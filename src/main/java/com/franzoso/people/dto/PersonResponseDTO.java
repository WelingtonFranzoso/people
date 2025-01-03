package com.franzoso.people.dto;

import com.franzoso.people.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponseDTO {

    private Long id;
    private String name;
    private Integer age;

    public PersonResponseDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.age = person.getAge();
    }
}
