package com.qf.firstspringboot.entity;


import java.io.Serializable;
import lombok.Data;

@Data
public class Air implements Serializable {

  private long id;
  private long districtId;
  private java.sql.Date monitorTime;
  private long pm10;
  private long pm25;
  private String monitoringStation;
  private java.sql.Date lastModifyTime;
}
