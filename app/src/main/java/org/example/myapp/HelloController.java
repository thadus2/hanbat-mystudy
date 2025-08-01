package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("")
  public String hi() { // 요청을 처리하는 메소드 -> request handler
    return "Hello";
  }

  @GetMapping("search") // URL 경로에서 name 값을 받음
  public String helloWithName(String search) {
    return "안녕하세요, " + search + "님!"; // 입력받은 이름을 포함한 메시지 리턴
  }
}
