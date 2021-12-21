package com.hendisantika.controller;

import com.hendisantika.dto.UserRegistrationDTO;
import com.hendisantika.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 08.09
 */
@Controller
@RequestMapping("/register")
public class UserRegistrationController {
    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDTO returnNewUserRegistrationDTO() {
        return new UserRegistrationDTO();
    }
}
