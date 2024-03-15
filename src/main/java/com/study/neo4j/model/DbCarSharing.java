package com.study.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node(value = "CarSharingService")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DbCarSharing {

    @Id
    @GeneratedValue
    private Long id;

    private String State;
}
