package com.pojo;


import java.sql.Date;

public class Customer {

  private long patientId;
  private long userId;
  private java.sql.Date dateOfBirth;
  private String gender;
  private String emergencyContact;


  public Customer() {
  }

  public Customer(long patientId, long userId, Date dateOfBirth, String gender, String emergencyContact) {
    this.patientId = patientId;
    this.userId = userId;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.emergencyContact = emergencyContact;
  }

  /**
   * 获取
   * @return patientId
   */
  public long getPatientId() {
    return patientId;
  }

  /**
   * 设置
   * @param patientId
   */
  public void setPatientId(long patientId) {
    this.patientId = patientId;
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
   * @return dateOfBirth
   */
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * 设置
   * @param dateOfBirth
   */
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * 获取
   * @return gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * 设置
   * @param gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * 获取
   * @return emergencyContact
   */
  public String getEmergencyContact() {
    return emergencyContact;
  }

  /**
   * 设置
   * @param emergencyContact
   */
  public void setEmergencyContact(String emergencyContact) {
    this.emergencyContact = emergencyContact;
  }

  public String toString() {
    return "Customer{patientId = " + patientId + ", userId = " + userId + ", dateOfBirth = " + dateOfBirth + ", gender = " + gender + ", emergencyContact = " + emergencyContact + "}";
  }
}
