package solvd.structure;

import solvd.Group;

import java.util.List;
import java.util.Objects;

public class Speciality {
    private String code;
    private String name;
    private List<Group> groups;

    public Speciality(){

    }
    public Speciality(String code, String name, List<Group> groups) {
        this.code = code;
        this.name = name;
        this.groups = groups;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speciality that = (Speciality) o;
        return code.equals(that.code) && name.equals(that.name) && Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, groups);
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
