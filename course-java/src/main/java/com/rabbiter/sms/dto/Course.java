package com.rabbiter.sms.dto;

import java.util.Date;

/**
 * Description 课程信息实体类
 * Author: rabbiter
 * Date: 2020/3/11 14:50
 **/
public class Course {
  /**
   * id
   */
  private String id;
  /**
   * 课程名
   */
  private String name;
  /**
   * 学分
   */
  private Double credits;
  /**
   * 满分   */
  private Integer score;
  /**
   * 课时
   */
  private Integer number;
  /**
   * 届时
   */
  private Integer year;
  /**
   * 学期
   */
  private Integer term;
  /**
   * 类型 1： 必修  2：选修
   */
  private Integer type;
  /**
   * 专业
   */
  private String profession;
  /**
   * 班级
   */
  private String grade;
  /**
   * 姓名
   */
  private String realName;
  /**
   * 学号
   */
  private String no;
  /**
   * 学生账号
   */
  private String studentId;
  /**
   * 查询的学生绩点
   */
  private String pointByUser;
  /**
   * 查询的学生分数
   */
  private String scoreByUser;
  /**
   * 查询的学生学分
   */
  private String creditsByUser;
  /**
   *周数 start
   */
  private Integer start;
  /**
   * 周数 end
   */
  private Integer end;
  /**
   * 教室
   */
  private String room;
  /**
   * 创建时间
   */
  private Date createTime;

  public Course() {
  }

  public Course(String id, String name, Double credits, Integer score, Integer number, Integer year, Integer term, Integer type, String profession, String grade, String realName, String no, String studentId, String pointByUser, String scoreByUser, String creditsByUser, Integer start, Integer end, String room, Date createTime) {
    this.id = id;
    this.name = name;
    this.credits = credits;
    this.score = score;
    this.number = number;
    this.year = year;
    this.term = term;
    this.type = type;
    this.profession = profession;
    this.grade = grade;
    this.realName = realName;
    this.no = no;
    this.studentId = studentId;
    this.pointByUser = pointByUser;
    this.scoreByUser = scoreByUser;
    this.creditsByUser = creditsByUser;
    this.start = start;
    this.end = end;
    this.room = room;
    this.createTime = createTime;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getCredits() {
    return credits;
  }

  public void setCredits(Double credits) {
    this.credits = credits;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getNo() {
    return no;
  }

  public void setNo(String no) {
    this.no = no;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getPointByUser() {
    return pointByUser;
  }

  public void setPointByUser(String pointByUser) {
    this.pointByUser = pointByUser;
  }

  public String getScoreByUser() {
    return scoreByUser;
  }

  public void setScoreByUser(String scoreByUser) {
    this.scoreByUser = scoreByUser;
  }

  public String getCreditsByUser() {
    return creditsByUser;
  }

  public void setCreditsByUser(String creditsByUser) {
    this.creditsByUser = creditsByUser;
  }

  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "Course{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", credits=" + credits +
            ", score=" + score +
            ", number=" + number +
            ", year=" + year +
            ", term=" + term +
            ", type=" + type +
            ", profession='" + profession + '\'' +
            ", grade='" + grade + '\'' +
            ", realName='" + realName + '\'' +
            ", no='" + no + '\'' +
            ", studentId='" + studentId + '\'' +
            ", pointByUser='" + pointByUser + '\'' +
            ", scoreByUser='" + scoreByUser + '\'' +
            ", creditsByUser='" + creditsByUser + '\'' +
            ", start=" + start +
            ", end=" + end +
            ", room='" + room + '\'' +
            ", createTime=" + createTime +
            '}';
  }
}
