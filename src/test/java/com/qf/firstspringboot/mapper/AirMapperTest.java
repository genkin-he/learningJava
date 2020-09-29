package com.qf.firstspringboot.mapper;

import com.qf.firstspringboot.FirstSpringbootApplicationTests;
import com.qf.firstspringboot.entity.Air;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)// SpringJUnit支持，由此引入Spring-Test框架支持！
@ContextConfiguration({"classpath:mapper/*.xml"})
//用于加载bean
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

  @org.junit.Test
  public void testFindAll() {
    List<Air> list = airMapper.findAll();
    for (Air air : list) {
      System.out.println(air);
    }
  }
}