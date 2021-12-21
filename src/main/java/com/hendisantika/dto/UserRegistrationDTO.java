package com.hendisantika.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 07.46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
