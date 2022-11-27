package solvd.structure;

import java.util.Objects;

//Кафедра
public class Department {
    private Faculty faculty;
    private String name;

    public Department(){

    }
    public Department(Faculty faculty, String name) {
        this.faculty = faculty;
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return faculty.equals(that.faculty) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "faculty=" + faculty +
                ", name='" + name + '\'' +
                '}';
    }
}
