package com.pojo;


import java.sql.Timestamp;

public class Users {

  private long id;
  private String username;
  private String password;
  private String email;
  private String phoneNumber;
  private String role;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public Users() {
  }

  public Users(long id, String username, String password, String email, String phoneNumber, String role, Timestamp createdAt, Timestamp updatedAt) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.role = role;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * 获取
   * @return id
   */
  public long getId() {
    return id;
  }

  /**
   * 设置
   * @param id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * 获取
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * 设置
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * 获取
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * 设置
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * 获取
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * 设置
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * 获取
   * @return phoneNumber
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * 设置
   * @param phoneNumber
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * 获取
   * @return role
   */
  public String getRole() {
    return role;
  }

  /**
   * 设置
   * @param role
   */
  public void setRole(String role) {
    this.role = role;
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
    return "Users{id = " + id + ", username = " + username + ", password = " + password + ", email = " + email + ", phoneNumber = " + phoneNumber + ", role = " + role + ", createdAt = " + createdAt + ", updatedAt = " + updatedAt + "}";
  }
}
