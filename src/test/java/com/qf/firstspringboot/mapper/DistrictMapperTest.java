package com.qf.firstspringboot.mapper;

import com.qf.firstspringboot.FirstSpringbootApplicationTests;
import com.qf.firstspringboot.entity.District;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DistrictMapperTest extends FirstSpringbootApplicationTests {

  @Autowired
  private DistrictMapper mapper;

  @Test
  void findAll() {
    List<District> list = mapper.findAll();
    for (District district : list) {
      System.out.println(district);
    }
  }

  @Test
  void findOneById() {
    District district = mapper.findOneById(1);
    System.out.println(district);
  }
}