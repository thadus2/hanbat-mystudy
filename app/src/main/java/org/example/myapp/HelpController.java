package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler의 리턴 값은 Thymeleaf가 실행할 view(템플릿 파일) 이름
public class HelpController {

  @GetMapping("/help")
  public String help() {
    return "help"; // return 값은 클라이언트에게 보낼 값이 아닌, Thymeleaf에게 보낼 탬플릿 파일 이름.
  }
}
