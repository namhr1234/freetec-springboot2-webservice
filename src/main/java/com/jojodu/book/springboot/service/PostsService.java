package com.jojodu.book.springboot.service;


import com.jojodu.book.springboot.web.domain.posts.Posts;
import com.jojodu.book.springboot.web.domain.posts.PostsRepository;
import com.jojodu.book.springboot.web.web.dto.PostsSaveRequestDto;
import com.jojodu.book.springboot.web.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService{
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    public Long update(Long id, PostsUpdateRequestDto requestDto){

        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id =" + id));

        return id;
    }

}
