package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@EnableAutoConfiguration // 스프링부트 실행에 필요한 기본 설정 자동으로 저장
@ComponentScan  //
 */
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("스프링 부트 서버 시작!");
  }
}
