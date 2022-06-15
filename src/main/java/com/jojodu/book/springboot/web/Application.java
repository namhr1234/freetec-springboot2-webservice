package com.jojodu.book.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 2022.06.14 스프링부트의 자동 설정, 스프링 빈 읽기 생성을 모두 자동으로 해준다!! 프로젝트 최상단에 위치해야 한다!
public class Application {

        public static void main(String[] args){
            SpringApplication.run(Application.class, args);
        }
}
