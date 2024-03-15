package com.study.neo4j.controller;

import com.study.neo4j.dto.PersonDto;
import com.study.neo4j.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<PersonDto> getPersons() {
        return this.personService.getPersons();
    }

    @PostMapping
    public PersonDto create(@RequestBody PersonDto dto) {
        return this.personService.createOrUpdate(dto);
    }

    @PutMapping
    public PersonDto update(@RequestBody PersonDto dto) {
        return this.personService.createOrUpdate(dto);
    }

    @DeleteMapping("/{personId}")
    public Long delete(@PathVariable Long personId) {
        return this.personService.delete(personId);
    }
}
