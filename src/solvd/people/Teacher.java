package solvd.people;

import solvd.Tittles;
import solvd.structure.Department;

import java.util.Date;
import java.util.Objects;

public class Teacher extends Person {
    private Department department;
    private Tittles tittle;

    public Teacher(){

    }

    public Teacher(String fullName, String gender, Date birthday, Department department, Tittles tittle) {
        super(fullName, gender, birthday);
        this.department = department;
        this.tittle = tittle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Tittles getTittle() {
        return tittle;
    }

    public void setTittle(Tittles tittle) {
        this.tittle = tittle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return department.equals(teacher.department) && tittle == teacher.tittle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, tittle);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department=" + department +
                ", tittle=" + tittle +
                '}';
    }
}
