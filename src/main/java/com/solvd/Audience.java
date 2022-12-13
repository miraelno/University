package com.solvd;

import java.util.Objects;

public class Audience {
    private String number;
    private int floor;
    private int maxNumOfSeats;

    public Audience(){

    }

    public Audience(String number, int floor, int maxNumOfSeats) {
        this.number = number;
        this.floor = floor;
        this.maxNumOfSeats = maxNumOfSeats;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getMaxNumOfSeats() {
        return maxNumOfSeats;
    }

    public void setMaxNumOfSeats(int maxNumOfSeats) {
        this.maxNumOfSeats = maxNumOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience audience = (Audience) o;
        return floor == audience.floor && maxNumOfSeats == audience.maxNumOfSeats && number.equals(audience.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, floor, maxNumOfSeats);
    }

    @Override
    public String toString() {
        return "Audience{" +
                "number='" + number + '\'' +
                ", floor=" + floor +
                ", maxNumOfSeats=" + maxNumOfSeats +
                '}';
    }
}
