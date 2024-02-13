package com.management.product.model.dto;

public class SeasonEventDTO {

    private int eventCode;
    private int seasonCode;
    private String seasonName;
    private int userCode;
    private String userName;
    private int bookCode;
    private String bookName;

    public SeasonEventDTO() {
    }

    public SeasonEventDTO(int eventCode, int seasonCode, int bookCode, int userCode, String bookName, String seasonName, String userName) {
        this.eventCode = eventCode;
        this.seasonCode = seasonCode;
        this.bookCode = bookCode;
        this.userCode = userCode;
        this.bookName = bookName;
        this.seasonName = seasonName;
        this.userName = userName;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public int getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(int seasonCode) {
        this.seasonCode = seasonCode;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "🎉" +
                  eventCode +
                ": 회원명=" + userName +
                ", 어울리는 계절=" + seasonName +
                ", 당첨된 책=" + bookName
//                ", seasonCode=" + seasonCode +
//                ", userCode=" + userCode +
//                ", bookCode=" + bookCode +
                ;
    }
}
