package com.management.product.model.dto;

public class SeasonDTO {

    private int seasonCode;
    private String seasonName;

    public SeasonDTO() {
    }

    public SeasonDTO(int seasonCode, String seasonName) {
        this.seasonCode = seasonCode;
        this.seasonName = seasonName;
    }

    public int getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(int seasonCode) {
        this.seasonCode = seasonCode;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    @Override
    public String toString() {
        return "SeasonDTO{" +
                "seasonCode=" + seasonCode +
                ", seasonName='" + seasonName + '\'' +
                '}';
    }
}
