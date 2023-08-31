package com.rabbiter.sms.domain;

/**
 * Description 专业实体类
 * Author: rabbiter
 * Date: 2020/3/31 17:25
 **/
public class Profession {
  /**
   * 专业id
   */
  private Integer id;
  /**
   * 专业名
   */
  private String name;

  public Profession() {
  }

  public Profession(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
