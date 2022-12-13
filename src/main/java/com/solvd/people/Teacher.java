package com.solvd.people;

import com.solvd.Subject;
import com.solvd.enums.Gender;
import com.solvd.enums.Tittles;
import com.solvd.structure.Department;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private Department department;
    private Tittles tittle;
    private List<Subject> subjects;

    public Teacher(){

    }
    public Teacher(String fullName, Gender gender, Date birthday, Department department, Tittles tittle,
                   List<Subject> subjects) {
        super(fullName, gender, birthday);
        this.department = department;
        this.tittle = tittle;
        this.subjects = subjects;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return department.equals(teacher.department) && tittle == teacher.tittle && Objects.equals(subjects, teacher.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, tittle, subjects);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department=" + department +
                ", tittle=" + tittle +
                ", subjects=" + subjects +
                '}';
    }
}
