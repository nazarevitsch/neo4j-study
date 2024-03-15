package com.study.neo4j.controller;

import com.study.neo4j.dto.PostDto;
import com.study.neo4j.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public PostDto createPost(@RequestParam("personId") Long personId, @RequestBody PostDto dto) {
        return this.postService.createPost(personId, dto);
    }
}
