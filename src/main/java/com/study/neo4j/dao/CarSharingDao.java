package com.study.neo4j.dao;

import com.study.neo4j.model.DbCarSharing;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarSharingDao extends Neo4jRepository<DbCarSharing, Long> {
}
