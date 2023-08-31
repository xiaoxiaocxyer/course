package com.rabbiter.sms.dto;

/**
 * Description 分数信息实体类
 * Author: rabbiter
 * Date: 2020/3/19 10:55
 **/
public class Score {
  /**
   * id
   */
  private Long id;
  /**
   * 用户名
   */
  private String username;
  /**
   * 课程名
   */
  private String name;
  /**
   * 分数
   */
  private String scoreByUser;
  /**
   * 绩点
   */
  private String pointByUser;
  /**
   * 学分
   */
  private String creditsByUser;
  /**
   * 总分
   */
  private Integer score;
  /**
   * 学分
   */
  private String credits;
  /**
   * 学期
   */
  private Integer term;
  /**
   * 届时
   */
  private Integer year;
  /**
   * 学号
   */
  private String no;
  /**
   * 学生账号id
   */
  private String studentId;
  /**
   * 课程id
   */
  private String courseId;

  public Score() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Score(Long id, String username, String name, String scoreByUser, String pointByUser, String creditsByUser, Integer score, String credits, Integer term, Integer year, String no, String studentId, String courseId) {
    this.id = id;
    this.username = username;
    this.name = name;
    this.scoreByUser = scoreByUser;
    this.pointByUser = pointByUser;
    this.creditsByUser = creditsByUser;
    this.score = score;
    this.credits = credits;
    this.term = term;
    this.year = year;
    this.no = no;
    this.studentId = studentId;
    this.courseId = courseId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getScoreByUser() {
    return scoreByUser;
  }

  public void setScoreByUser(String scoreByUser) {
    this.scoreByUser = scoreByUser;
  }

  public String getPointByUser() {
    return pointByUser;
  }

  public void setPointByUser(String pointByUser) {
    this.pointByUser = pointByUser;
  }

  public String getCreditsByUser() {
    return creditsByUser;
  }

  public void setCreditsByUser(String creditsByUser) {
    this.creditsByUser = creditsByUser;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public String getCredits() {
    return credits;
  }

  public void setCredits(String credits) {
    this.credits = credits;
  }

  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
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

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  @Override
  public String toString() {
    return "Score{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", name='" + name + '\'' +
            ", scoreByUser='" + scoreByUser + '\'' +
            ", pointByUser='" + pointByUser + '\'' +
            ", creditsByUser='" + creditsByUser + '\'' +
            ", score=" + score +
            ", credits='" + credits + '\'' +
            ", term=" + term +
            ", year=" + year +
            ", no='" + no + '\'' +
            ", studentId='" + studentId + '\'' +
            ", courseId='" + courseId + '\'' +
            '}';
  }
}
