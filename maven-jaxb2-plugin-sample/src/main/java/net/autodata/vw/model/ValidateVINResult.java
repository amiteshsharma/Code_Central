package net.autodata.vw.model;

/*
* Copyright (c) 2012 Autodata Solutions.
*
* All Rights Reserved. This source code is the confidential and proprietary
* information of Autodata. The user shall not, in whole or in part, modify,
* copy, publish, disclose or make any use of this source code unless
* specifically authorized in a written agreement with Autodata.
*
*/
public class ValidateVINResult {
    private String vin;
    private int year;
    private String brand;
    private String model;
    private String extColor;
    private String intColor;
    private String dealerCode;
    private String status;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExtColor() {
        return extColor;
    }

    public void setExtColor(String extColor) {
        this.extColor = extColor;
    }

    public String getIntColor() {
        return intColor;
    }

    public void setIntColor(String intColor) {
        this.intColor = intColor;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ValidateVINResult{" +
                "vin='" + vin + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", extColor='" + extColor + '\'' +
                ", intColor='" + intColor + '\'' +
                ", dealerCode='" + dealerCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
