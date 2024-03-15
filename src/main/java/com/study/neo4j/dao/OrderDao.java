package com.study.neo4j.dao;

import com.study.neo4j.model.DbOrder;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends Neo4jRepository<DbOrder, Long> {

    List<DbOrder> findAllByBrand(String brand);
}
