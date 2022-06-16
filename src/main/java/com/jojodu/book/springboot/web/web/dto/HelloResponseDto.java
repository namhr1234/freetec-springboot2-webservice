package com.jojodu.book.springboot.web.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name; //22.06.15 lombok 테스트 해보니 에러났다 . Gradle 5.x이상이였기때문이다. Variable not initialized in the default constructor
    private final int amount;

}
