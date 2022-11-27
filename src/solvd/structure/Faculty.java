package solvd.structure;

import java.util.List;
import java.util.Objects;

public class Faculty extends ContactInfo{
    private String name;
    private List<Department> departments;

    public Faculty(){

    }

    public Faculty(String phone, String email, String name, List<Department> departments) {
        super(phone, email);
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return name.equals(faculty.name) && departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, departments);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
