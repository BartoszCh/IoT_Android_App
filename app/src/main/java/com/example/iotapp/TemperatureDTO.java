package com.example.iotapp;

import java.util.List;

public class TemperatureDTO {
    private String deviceId;
    private String userId;
    private String temp;
    private String timestamp;

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTemp() {
        return temp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public TemperatureDTO(String deviceId, String userId, String temp, String timestamp) {
        this.deviceId = deviceId;
        this.userId = userId;
        this.temp = temp;
        this.timestamp = timestamp;
    }
}
