package com.study.neo4j.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node(value = "Post")
@Data
@NoArgsConstructor
public class DbPost {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    @Relationship(type = "CREATED", direction = Relationship.Direction.INCOMING)
    private DbPerson person;
}
