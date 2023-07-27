package com.example.dashboard.dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DefectLogDto{

    private int sno;

    private String timeStamp;

    private int bottleNo;

    private String bottleType;

    private String  bottleRegion;

    private String defect;

    private String defectType;

    private byte[] image;

    private int score1;

    private int markFalsePositive;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getBottleNo() {
        return bottleNo;
    }

    public void setBottleNo(int bottleNo) {
        this.bottleNo = bottleNo;
    }

    public String getBottleType() {
        return bottleType;
    }

    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }

    public String getBottleRegion() {
        return bottleRegion;
    }

    public void setBottleRegion(String bottleRegion) {
        this.bottleRegion = bottleRegion;
    }

    public String getDefect() {
        return defect;
    }

    public void setDefect(String defect) {
        this.defect = defect;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getMarkFalsePositive() {
        return markFalsePositive;
    }

    public void setMarkFalsePositive(int markFalsePositive) {
        this.markFalsePositive = markFalsePositive;
    }

}