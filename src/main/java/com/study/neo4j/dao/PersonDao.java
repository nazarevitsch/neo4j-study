package com.study.neo4j.dao;

import com.study.neo4j.model.DbPerson;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends Neo4jRepository<DbPerson, Long> {

}
