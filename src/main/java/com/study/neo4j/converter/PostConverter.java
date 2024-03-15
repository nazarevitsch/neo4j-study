package com.study.neo4j.converter;

import com.study.neo4j.dto.PostDto;
import com.study.neo4j.model.DbPost;
import org.springframework.stereotype.Component;

@Component
public class PostConverter {

    public PostDto fromDbToDto(DbPost db) {
        PostDto dto = new PostDto();
        dto.setId(db.getId());
        dto.setText(db.getText());
        return dto;
    }

    public DbPost fromDtoToDb(PostDto dto) {
        DbPost db = new DbPost();
        db.setId(dto.getId());
        db.setText(dto.getText());
        return db;
    }
}
