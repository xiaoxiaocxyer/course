package com.rabbiter.sms.domain;

/**
 * Description 课程具体安排
 * Author: rabbiter
 * Date: 2020/5/3 14:48
 **/
public class CourseInfo {
  /**
   * id
   */
  private Integer id;
  /**
   * 课程id
   */
  private String courseId;
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
   * 专业
   */
  private String profession;

  public CourseInfo() {
  }

  public CourseInfo(Integer id, String courseId, Integer start, Integer end, String room, String profession) {
    this.id = id;
    this.courseId = courseId;
    this.start = start;
    this.end = end;
    this.room = room;
    this.profession = profession;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
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

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  @Override
  public String toString() {
    return "CourseInfo{" +
            "id=" + id +
            ", courseId='" + courseId + '\'' +
            ", start=" + start +
            ", end=" + end +
            ", room='" + room + '\'' +
            ", profession='" + profession + '\'' +
            '}';
  }
}
