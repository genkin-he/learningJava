package com.qf.firstspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qf.firstspringboot.mapper")
public class FirstSpringbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(FirstSpringbootApplication.class, args);
  }


}
