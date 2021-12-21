package com.hendisantika.service;

import com.hendisantika.dto.UserRegistrationDTO;
import com.hendisantika.model.Role;
import com.hendisantika.model.User;
import com.hendisantika.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 07.48
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public User save(UserRegistrationDTO registerDTO) {
        User user = new User(registerDTO.getFirstname(),
                registerDTO.getLastname(), registerDTO.getEmail(),
                passwordEncoder.encode(registerDTO.getPassword()), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new User(user.getEmail(), user.getPassword(), mapearAutoridadesRoles(user.getRoles()));
    }
}
