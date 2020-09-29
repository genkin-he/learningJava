package com.qf.firstspringboot.config;

import com.qf.firstspringboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

  @Bean(name = "user1")
  public User user() {
    User user = new User();
    user.setId(12);
    user.setName("吴旭娟是个大笨蛋！");
    return user;
  }
}
