package com.management.product.model.dto;

public class UserDTO {

    private int userCode;
    private String userName;
    private String userAge;
    private String userPhone;
    private int userSeasonCode;

    public UserDTO() {
    }

    public UserDTO(int userCode, String userName, String userAge, String userPhone, int userSeasonCode) {
        this.userCode = userCode;
        this.userName = userName;
        this.userAge = userAge;
        this.userPhone = userPhone;
        this.userSeasonCode = userSeasonCode;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserSeasonCode() {
        return userSeasonCode;
    }

    public void setUserSeasonCode(int userSeasonCode) {
        this.userSeasonCode = userSeasonCode;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userCode=" + userCode +
                ", userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSeasonCode=" + userSeasonCode +
                '}';
    }
}
