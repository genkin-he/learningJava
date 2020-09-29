package com.qf.firstspringboot.mapper;

import com.qf.firstspringboot.FirstSpringbootApplicationTests;
import com.qf.firstspringboot.entity.Air;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AirMapperTest extends FirstSpringbootApplicationTests {

  @Autowired
  private AirMapper airMapper;

  @Test
  void findAll() {
    List<Air> list = airMapper.findAll();
    for (Air air : list) {
      System.out.println(air);
    }
  }
}