package com.hendisantika.repository;

import com.hendisantika.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-user-registration
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/12/21
 * Time: 07.45
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
