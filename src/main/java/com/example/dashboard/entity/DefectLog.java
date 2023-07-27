package com.example.dashboard.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Defect_Log")
public class DefectLog {

    @Id
    @Column(name = "SNO")
    private Integer sno;

    @Column(name = "Time_Stamp")
    private String timeStamp;

    @Column(name = "Bottle_No")
    private Integer bottleNo;

    @Column(name = "Bottle_Type")
    private String bottleType;

    @Column(name = "Bottle_Region")
    private String  bottleRegion;

    @Column(name = "Defect")
    private String defect;

    @Column(name = "Defect_Type")
    private String defectType;

    @Column(name = "Image")
    private byte[] image;

    @Column(name = "Score1")
    private Integer score1;

    @Column(name = "Mark_False_Positive")
    private Integer markFalsePositive;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getBottleNo() {
        return bottleNo;
    }

    public void setBottleNo(Integer bottleNo) {
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

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getMarkFalsePositive() {
        return markFalsePositive;
    }

    public void setMarkFalsePositive(Integer markFalsePositive) {
        this.markFalsePositive = markFalsePositive;
    }

    @Override
    public String toString() {
        return "DefectLog{" +
                "sno=" + sno +
                ", timeStamp='" + timeStamp + '\'' +
                ", bottleNo=" + bottleNo +
                ", bottleType='" + bottleType + '\'' +
                ", bottleRegion='" + bottleRegion + '\'' +
                ", defect='" + defect + '\'' +
                ", defectType='" + defectType + '\'' +
                ", image=" + Arrays.toString(image) +
                ", score1=" + score1 +
                ", markFalsePositive=" + markFalsePositive +
                '}';
    }
}
