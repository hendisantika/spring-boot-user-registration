package com.hendisantika.service;

import com.hendisantika.dto.UserRegistrationDTO;
import com.hendisantika.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 07.48
 */

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO userRegistrationDTO);

    List<User> listUsers();
}
