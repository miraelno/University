package com.solvd.structure;

import com.solvd.Audience;

import java.util.List;
import java.util.Objects;

//Корпус
public class UniversityBuilding {
    private String name;
    private int storeys;
    private List<Audience> audiences;

    public UniversityBuilding(){}

    public UniversityBuilding(String name, int storeys, List<Audience> audiences) {
        this.name = name;
        this.storeys = storeys;
        this.audiences = audiences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreys() {
        return storeys;
    }

    public void setStoreys(int storeys) {
        this.storeys = storeys;
    }

    public List<Audience> getAudiences() {
        return audiences;
    }

    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityBuilding that = (UniversityBuilding) o;
        return storeys == that.storeys && name.equals(that.name) && audiences.equals(that.audiences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, storeys, audiences);
    }

    @Override
    public String toString() {
        return "UniversityBuilding{" +
                "name='" + name + '\'' +
                ", storeys=" + storeys +
                ", audiences=" + audiences +
                '}';
    }
}
