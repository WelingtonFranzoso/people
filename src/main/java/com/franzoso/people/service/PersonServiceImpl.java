package com.franzoso.people.service;

import com.franzoso.people.dto.PersonRequestDTO;
import com.franzoso.people.dto.PersonResponseDTO;
import com.franzoso.people.entity.Person;
import com.franzoso.people.repositories.PersonRepository;
import com.franzoso.people.util.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {


    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    @Override
    public PersonResponseDTO findById(Long id) {
        return personMapper.toResponseDTO(returnPerson(id));
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return personMapper.toResponseList(personRepository.findAll());
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personRequestDTO) {
        Person person = personMapper.toPerson(personRequestDTO);
        return personMapper.toResponseDTO(personRepository.save(person));
    }

    @Override
    public PersonResponseDTO update(Long id, PersonRequestDTO personRequestDTO) {
        Person person = returnPerson(id);
        personMapper.updatePerson(person, personRequestDTO);
        return personMapper.toResponseDTO(personRepository.save(person));
    }

    @Override
    public String deleteById(Long id) {
        personRepository.deleteById(id);
        return "Person was deleted!";
    }

    private Person returnPerson(Long id) {
        return personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person was not found on database"));
    }
}
