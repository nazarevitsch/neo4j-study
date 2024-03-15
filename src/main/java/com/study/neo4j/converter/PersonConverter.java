package com.study.neo4j.converter;

import com.study.neo4j.dto.PersonDto;
import com.study.neo4j.model.DbPerson;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter {

    public PersonDto fromDbToDto(DbPerson db) {
        PersonDto dto = new PersonDto();
        dto.setId(db.getId());
        dto.setFirstName(db.getFirstName());
        dto.setLastName(db.getLastName());
        dto.setEmail(db.getEmail());
        dto.setAge(db.getAge());
        return dto;
    }

    public DbPerson fromDtoToDb(PersonDto dto) {
        DbPerson db = new DbPerson();
        db.setId(dto.getId());
        db.setFirstName(dto.getFirstName());
        db.setLastName(dto.getLastName());
        db.setEmail(dto.getEmail());
        db.setAge(dto.getAge());
        return db;
    }
}
