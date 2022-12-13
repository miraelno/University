package com.solvd.structure;

import com.solvd.Group;

import java.util.List;
import java.util.Objects;

//Кафедра
public class Department extends AbstractStructure {
    private String name;
    private List<Group> groups;
    public Department(){

    }
    public Department(String phone, String email, String name, List<Group> groups) {
        super(phone, email);
        this.name = name;
        this.groups = groups;
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
        if (!super.equals(o)) return false;
        Department that = (Department) o;
        return name.equals(that.name) && groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, groups);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
