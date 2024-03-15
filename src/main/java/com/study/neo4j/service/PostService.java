package com.study.neo4j.service;

import com.study.neo4j.converter.PostConverter;
import com.study.neo4j.dao.PersonDao;
import com.study.neo4j.dao.PostDao;
import com.study.neo4j.dto.PostDto;
import com.study.neo4j.model.DbPost;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostDao postDao;
    private final PostConverter converter;
    private final PersonDao personDao;

    public PostDto createPost(Long personId, PostDto dto) {
        DbPost post = this.converter.fromDtoToDb(dto);
        post.setPerson(this.personDao.findById(personId).get());

        DbPost saved = this.postDao.save(post);

        return this.converter.fromDbToDto(saved);
    }
}
