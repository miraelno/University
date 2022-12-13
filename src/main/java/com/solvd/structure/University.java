package com.solvd.structure;

import main.java.com.solvd.structure.Faculty;

import java.util.List;
import java.util.Objects;

public class University{
    private String name;
    private String phone;
    private String email;
    private String address;
    private List<UniversityBuilding> universityBuildings;
    private List<Faculty> faculties;

    public University(){

    }

    public University(String name, String phone, String email, String address,
                      List<UniversityBuilding> universityBuildings, List<Faculty> faculties) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.universityBuildings = universityBuildings;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<UniversityBuilding> getUniversityBuildings() {
        return universityBuildings;
    }

    public void setUniversityBuildings(List<UniversityBuilding> universityBuildings) {
        this.universityBuildings = universityBuildings;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return name.equals(that.name) && phone.equals(that.phone) && email.equals(that.email) && address.equals(that.address) && Objects.equals(universityBuildings, that.universityBuildings) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email, address, universityBuildings, faculties);
    }
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", universityBuildings=" + universityBuildings +
                ", faculties=" + faculties +
                '}';
    }
}
