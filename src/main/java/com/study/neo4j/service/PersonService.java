package com.study.neo4j.service;

import com.study.neo4j.converter.PersonConverter;
import com.study.neo4j.dao.PersonDao;
import com.study.neo4j.dto.PersonDto;
import com.study.neo4j.model.DbPerson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonDao personDao;
    private final PersonConverter converter;

    public List<PersonDto> getPersons() {
        return this.personDao.findAll()
                .stream()
                .map(this.converter::fromDbToDto)
                .toList();
    }

    public PersonDto createOrUpdate(PersonDto dto) {
        DbPerson person = this.converter.fromDtoToDb(dto);
        DbPerson saved = this.personDao.save(person);
        return this.converter.fromDbToDto(saved);
    }

    public Long delete(Long personId) {
        DbPerson person = this.personDao.findById(personId).get();
        this.personDao.deleteById(personId);
        return personId;
    }
}
