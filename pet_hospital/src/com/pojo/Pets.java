package com.pojo;


public class Pets {

  private long petId;
  private long ownerId;
  private String petName;
  private String species;
  private String breed;
  private String bloodType;
  private long age;
  private String medicalHistory;


  public Pets() {
  }

  public Pets(long petId, long ownerId, String petName, String species, String breed, String bloodType, long age, String medicalHistory) {
    this.petId = petId;
    this.ownerId = ownerId;
    this.petName = petName;
    this.species = species;
    this.breed = breed;
    this.bloodType = bloodType;
    this.age = age;
    this.medicalHistory = medicalHistory;
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
   * @return petName
   */
  public String getPetName() {
    return petName;
  }

  /**
   * 设置
   * @param petName
   */
  public void setPetName(String petName) {
    this.petName = petName;
  }

  /**
   * 获取
   * @return species
   */
  public String getSpecies() {
    return species;
  }

  /**
   * 设置
   * @param species
   */
  public void setSpecies(String species) {
    this.species = species;
  }

  /**
   * 获取
   * @return breed
   */
  public String getBreed() {
    return breed;
  }

  /**
   * 设置
   * @param breed
   */
  public void setBreed(String breed) {
    this.breed = breed;
  }

  /**
   * 获取
   * @return bloodType
   */
  public String getBloodType() {
    return bloodType;
  }

  /**
   * 设置
   * @param bloodType
   */
  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }

  /**
   * 获取
   * @return age
   */
  public long getAge() {
    return age;
  }

  /**
   * 设置
   * @param age
   */
  public void setAge(long age) {
    this.age = age;
  }

  /**
   * 获取
   * @return medicalHistory
   */
  public String getMedicalHistory() {
    return medicalHistory;
  }

  /**
   * 设置
   * @param medicalHistory
   */
  public void setMedicalHistory(String medicalHistory) {
    this.medicalHistory = medicalHistory;
  }

  public String toString() {
    return "Pets{petId = " + petId + ", ownerId = " + ownerId + ", petName = " + petName + ", species = " + species + ", breed = " + breed + ", bloodType = " + bloodType + ", age = " + age + ", medicalHistory = " + medicalHistory + "}";
  }
}
