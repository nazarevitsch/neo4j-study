package com.study.neo4j.service;

import com.study.neo4j.dao.CarSharingDao;
import com.study.neo4j.model.DbCarSharing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarSharingService {

    private final CarSharingDao dao;

    public void generate() {
        Randomizer.getStates().forEach(state -> this.dao.save(new DbCarSharing(null, state)));
    }
}
