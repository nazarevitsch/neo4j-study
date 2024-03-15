package com.study.neo4j.dto;

import lombok.Data;

@Data
public class OrderDto {
    private Long id;
    private String brand;
    private String state;
    private int price;
}
