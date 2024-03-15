package com.study.neo4j.dao;

import com.study.neo4j.model.DbPost;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends Neo4jRepository<DbPost, Long> {
}
