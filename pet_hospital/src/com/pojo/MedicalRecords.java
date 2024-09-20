package com.pojo;


import java.sql.Timestamp;

public class MedicalRecords {

  private long recordId;
  private long petId;
  private long ownerId;
  private long doctorId;
  private long appointmentId;
  private String diagnosis;
  private String treatment;
  private String notes;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public MedicalRecords() {
  }

  public MedicalRecords(long recordId, long petId, long ownerId, long doctorId, long appointmentId, String diagnosis, String treatment, String notes, Timestamp createdAt, Timestamp updatedAt) {
    this.recordId = recordId;
    this.petId = petId;
    this.ownerId = ownerId;
    this.doctorId = doctorId;
    this.appointmentId = appointmentId;
    this.diagnosis = diagnosis;
    this.treatment = treatment;
    this.notes = notes;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * 获取
   * @return recordId
   */
  public long getRecordId() {
    return recordId;
  }

  /**
   * 设置
   * @param recordId
   */
  public void setRecordId(long recordId) {
    this.recordId = recordId;
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
   * @return diagnosis
   */
  public String getDiagnosis() {
    return diagnosis;
  }

  /**
   * 设置
   * @param diagnosis
   */
  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  /**
   * 获取
   * @return treatment
   */
  public String getTreatment() {
    return treatment;
  }

  /**
   * 设置
   * @param treatment
   */
  public void setTreatment(String treatment) {
    this.treatment = treatment;
  }

  /**
   * 获取
   * @return notes
   */
  public String getNotes() {
    return notes;
  }

  /**
   * 设置
   * @param notes
   */
  public void setNotes(String notes) {
    this.notes = notes;
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
    return "MedicalRecords{recordId = " + recordId + ", petId = " + petId + ", ownerId = " + ownerId + ", doctorId = " + doctorId + ", appointmentId = " + appointmentId + ", diagnosis = " + diagnosis + ", treatment = " + treatment + ", notes = " + notes + ", createdAt = " + createdAt + ", updatedAt = " + updatedAt + "}";
  }
}
