package com.george.model;

import java.util.Objects;

public class LandStatus {

    private String place;
    private Double moisture;
    private Status irrigationStatus;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Double getMoisture() {
        return moisture;
    }

    public void setMoisture(Double moisture) {
        this.moisture = moisture;
    }

    public Status getIrrigationStatus() {
        return irrigationStatus;
    }

    public void setIrrigationStatus(Status irrigationStatus) {
        this.irrigationStatus = irrigationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandStatus that = (LandStatus) o;
        return Objects.equals(place, that.place) &&
                Objects.equals(moisture, that.moisture) &&
                irrigationStatus == that.irrigationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, moisture, irrigationStatus);
    }

    @Override
    public String toString() {
        return "LandStatus{" +
                "place='" + place + '\'' +
                ", moisture=" + moisture +
                ", irrigationStatus=" + irrigationStatus +
                '}';
    }

}
