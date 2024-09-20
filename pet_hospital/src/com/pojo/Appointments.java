package com.pojo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Appointments {

  private long appointmentId;
  private long petId;
  private long ownerId;
  private long doctorId;
  private java.sql.Date appointmentDate;
  private java.sql.Time appointmentTime;
  private String reason;
  private String status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public Appointments() {
  }

  public Appointments(long appointmentId, long petId, long ownerId, long doctorId, Date appointmentDate, Time appointmentTime, String reason, String status, Timestamp createdAt, Timestamp updatedAt) {
    this.appointmentId = appointmentId;
    this.petId = petId;
    this.ownerId = ownerId;
    this.doctorId = doctorId;
    this.appointmentDate = appointmentDate;
    this.appointmentTime = appointmentTime;
    this.reason = reason;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * 获取
   * @return appointmentId
   */
  public long getAppointmentId() {
    return appointmentId;
  }

  /**
   * 设置
   * @param appointmentId
   */
  public void setAppointmentId(long appointmentId) {
    this.appointmentId = appointmentId;
  }

  /**
   * 获取
   * @return petId
   */
  public long getPetId() {
    return petId;
  }

  /**
   * 设置
   * @param petId
   */
  public void setPetId(long petId) {
    this.petId = petId;
  }

  /**
   * 获取
   * @return ownerId
   */
  public long getOwnerId() {
    return ownerId;
  }

  /**
   * 设置
   * @param ownerId
   */
  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
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
   * @return appointmentDate
   */
  public Date getAppointmentDate() {
    return appointmentDate;
  }

  /**
   * 设置
   * @param appointmentDate
   */
  public void setAppointmentDate(Date appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  /**
   * 获取
   * @return appointmentTime
   */
  public Time getAppointmentTime() {
    return appointmentTime;
  }

  /**
   * 设置
   * @param appointmentTime
   */
  public void setAppointmentTime(Time appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

  /**
   * 获取
   * @return reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * 设置
   * @param reason
   */
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * 获取
   * @return status
   */
  public String getStatus() {
    return status;
  }

  /**
   * 设置
   * @param status
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * 获取
   * @return createdAt
   */
  public Timestamp getCreatedAt() {
    return createdAt;
  }

  /**
   * 设置
   * @param createdAt
   */
  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 获取
   * @return updatedAt
   */
  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  /**
   * 设置
   * @param updatedAt
   */
  public void setUpdatedAt(Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String toString() {
    return "Appointments{appointmentId = " + appointmentId + ", petId = " + petId + ", ownerId = " + ownerId + ", doctorId = " + doctorId + ", appointmentDate = " + appointmentDate + ", appointmentTime = " + appointmentTime + ", reason = " + reason + ", status = " + status + ", createdAt = " + createdAt + ", updatedAt = " + updatedAt + "}";
  }
}
