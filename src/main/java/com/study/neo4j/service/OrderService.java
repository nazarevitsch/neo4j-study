package com.study.neo4j.service;

import com.study.neo4j.converter.OrderConverter;
import com.study.neo4j.dao.OrderDao;
import com.study.neo4j.dto.OrderDto;
import com.study.neo4j.model.DbOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderDao dao;
    private final OrderConverter converter;

    public List<OrderDto> findAllByBrand(String brand) {
        return this.dao.findAllByBrand(brand)
                .stream()
                .map(this.converter::fromDbToDto)
                .toList();
    }

    public void generate(Integer count) {
        for (int i = 0; i < count; i++) {
            this.dao.save(new DbOrder(null, Randomizer.randomBrand(), Randomizer.randomState(), Randomizer.randomPrice()));
        }
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }
}
