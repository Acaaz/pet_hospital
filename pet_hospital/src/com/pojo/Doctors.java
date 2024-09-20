package com.pojo;


public class Doctors {

  private long doctorId;
  private long userId;
  private String department;
  private String specialization;
  private long yearsOfExperience;
  private String introduction;


  public Doctors() {
  }

  public Doctors(long doctorId, long userId, String department, String specialization, long yearsOfExperience, String introduction) {
    this.doctorId = doctorId;
    this.userId = userId;
    this.department = department;
    this.specialization = specialization;
    this.yearsOfExperience = yearsOfExperience;
    this.introduction = introduction;
  }

  /**
   * 获取
   * @return doctorId
   */
  public long getDoctorId() {
    return doctorId;
  }

  /**
   * 设置
   * @param doctorId
   */
  public void setDoctorId(long doctorId) {
    this.doctorId = doctorId;
  }

  /**
   * 获取
   * @return userId
   */
  public long getUserId() {
    return userId;
  }

  /**
   * 设置
   * @param userId
   */
  public void setUserId(long userId) {
    this.userId = userId;
  }

  /**
   * 获取
   * @return department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * 设置
   * @param department
   */
  public void setDepartment(String department) {
    this.department = department;
  }

  /**
   * 获取
   * @return specialization
   */
  public String getSpecialization() {
    return specialization;
  }

  /**
   * 设置
   * @param specialization
   */
  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  /**
   * 获取
   * @return yearsOfExperience
   */
  public long getYearsOfExperience() {
    return yearsOfExperience;
  }

  /**
   * 设置
   * @param yearsOfExperience
   */
  public void setYearsOfExperience(long yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  /**
   * 获取
   * @return introduction
   */
  public String getIntroduction() {
    return introduction;
  }

  /**
   * 设置
   * @param introduction
   */
  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String toString() {
    return "Doctors{doctorId = " + doctorId + ", userId = " + userId + ", department = " + department + ", specialization = " + specialization + ", yearsOfExperience = " + yearsOfExperience + ", introduction = " + introduction + "}";
  }
}
