package com.franzoso.people.controller;

import com.franzoso.people.dto.PersonRequestDTO;
import com.franzoso.people.dto.PersonResponseDTO;
import com.franzoso.people.service.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServiceImpl personServiceImpl;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonResponseDTO> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(personServiceImpl.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<PersonResponseDTO>> findAll() {
        return ResponseEntity.ok().body(personServiceImpl.findAll());
    }

    @PostMapping
    public ResponseEntity<PersonResponseDTO> register(@RequestBody PersonRequestDTO personRequestDTO, UriComponentsBuilder uriComponentsBuilder) {
        PersonResponseDTO personResponseDTO = personServiceImpl.register(personRequestDTO);
        URI uri = uriComponentsBuilder.path("/people/{id}").buildAndExpand(personResponseDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(personResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PersonResponseDTO> update(@RequestBody PersonRequestDTO personRequestDTO, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(personServiceImpl.update(id, personRequestDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(personServiceImpl.deleteById(id));
    }
}
