package com.franzoso.people.util;

import com.franzoso.people.dto.PersonRequestDTO;
import com.franzoso.people.dto.PersonResponseDTO;
import com.franzoso.people.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public Person toPerson(PersonRequestDTO personRequestDTO) {
        return Person.builder()
                .name(personRequestDTO.getName())
                .socialSecurityNumber(personRequestDTO.getSocialSecurityNumber())
                .age(personRequestDTO.getAge())
                .build();
    }

    public PersonResponseDTO toResponseDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toResponseList(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePerson(Person person, PersonRequestDTO personRequestDTO) {
        person.setName(personRequestDTO.getName());
        person.setSocialSecurityNumber(personRequestDTO.getSocialSecurityNumber());
        person.setAge(personRequestDTO.getAge());
    }
}