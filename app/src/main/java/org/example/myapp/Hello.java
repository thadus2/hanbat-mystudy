package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨");
  }

  @GetMapping("/hi")
  public String hi() { // 요청을 처리하는 메소드 -> request handler
    return "Hello";
  }

  @GetMapping("/hi2")
  public String hi2(String name) {
    return "안녕하세요. " + name + "님";
  }

  @GetMapping("/hi3")
  public String hi3() { // 요청을 처리하는 메소드 -> request handler
    return "Hello";
  }
}
