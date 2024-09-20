package com.pojo;


public class Admins {

  private long adminId;
  private long userId;
  private String department;


  public Admins() {
  }

  public Admins(long adminId, long userId, String department) {
    this.adminId = adminId;
    this.userId = userId;
    this.department = department;
  }

  /**
   * 获取
   * @return adminId
   */
  public long getAdminId() {
    return adminId;
  }

  /**
   * 设置
   * @param adminId
   */
  public void setAdminId(long adminId) {
    this.adminId = adminId;
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

  public String toString() {
    return "Admins{adminId = " + adminId + ", userId = " + userId + ", department = " + department + "}";
  }
}
