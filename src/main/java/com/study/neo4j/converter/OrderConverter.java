package com.study.neo4j.converter;

import com.study.neo4j.dto.OrderDto;
import com.study.neo4j.model.DbOrder;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public OrderDto fromDbToDto(DbOrder db) {
        OrderDto dto = new OrderDto();
        dto.setId(db.getId());
        dto.setState(db.getState());
        dto.setBrand(db.getBrand());
        dto.setPrice(db.getPrice());
        return dto;
    }

    public DbOrder fromDtoToDb(OrderDto dto) {
        DbOrder db = new DbOrder();
        db.setId(dto.getId());
        db.setState(dto.getState());
        db.setBrand(dto.getBrand());
        db.setPrice(dto.getPrice());
        return db;
    }
}
