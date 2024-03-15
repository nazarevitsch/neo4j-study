package com.study.neo4j.controller;

import com.study.neo4j.dto.OrderDto;
import com.study.neo4j.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    public ResponseEntity<List<OrderDto>> getByBrand(@RequestParam String brand) {
        return ResponseEntity.ok(this.service.findAllByBrand(brand));
    }

    @PostMapping("/generate")
    public void generate(@RequestParam Integer count) {
        this.service.generate(count);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        this.service.deleteAll();
    }
}
