package com.jojodu.book.springboot.service;


import com.jojodu.book.springboot.web.domain.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService{
    private final PostsRepository postsRepository;



}
