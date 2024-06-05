package com.hendisantika.controller;

import com.hendisantika.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 08.05
 */
@Controller
@RequiredArgsConstructor
public class RegisterController {
    private final UserService userService;

    @GetMapping("/login")
    public String initSession() {
        return "login";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "index";
    }
}
