package com.qf.firstspringboot.controller;

import com.qf.firstspringboot.entity.Air;
import com.qf.firstspringboot.entity.User;
import com.qf.firstspringboot.mapper.AirMapper;
import com.qf.firstspringboot.properties.AliyunProperties;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Resource(name = "user1")
  private User user;

  @GetMapping("/test")
  public String test() {
    return "Hello SpringBoot !";
  }

  @GetMapping("/user")
  public User user() {
    return user;
  }

  @Value("${picPath}")
  private String picPath;

  @GetMapping("/picPath")
  public String picPath() {
    return picPath;
  }

  @Autowired
  private AliyunProperties properties;

  @GetMapping("aliyun")
  public AliyunProperties aliyun() {
    return properties;
  }

  @Autowired
  private AirMapper airMapper;

  @GetMapping("air")
  public List<Air> airMapper() {
    return airMapper.findAll();
  }

}
