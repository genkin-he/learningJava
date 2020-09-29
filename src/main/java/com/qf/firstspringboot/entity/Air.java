package com.qf.firstspringboot.entity;

import lombok.Data;

@Data
public class Air {

  private long id;
  private long districtId;
  private java.sql.Date monitorTime;
  private long pm10;
  private long pm25;
  private String monitoringStation;
  private java.sql.Date lastModifyTime;

}
