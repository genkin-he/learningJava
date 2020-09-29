package com.qf.firstspringboot.mapper;

import com.qf.firstspringboot.entity.Air;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface AirMapper {

  @Select("select * from air")
  List<Air> findAll();
}
