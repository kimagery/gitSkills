package com.example.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
public class UserController {

    @GetMapping("/get")
    public List<User> get() {
        return Arrays.asList(new User(1, "143334"), new User(2, "2"));
    }

    @GetMapping("/get12")
    public String get1() {
        return "Hello.html";
    }
}
