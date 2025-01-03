package com.franzoso.people.service;


import com.franzoso.people.dto.PersonRequestDTO;
import com.franzoso.people.dto.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personRequestDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO personRequestDTO);

    String deleteById (Long id);
}
