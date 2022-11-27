package solvd.people;

import solvd.enums.EducationType;
import solvd.RecordBook;
import solvd.structure.Department;

import java.util.Date;
import java.util.Objects;

public class Student extends Person {
    private Boolean isOnBudget;
    private Department department;
    private EducationType type;
    private RecordBook recordBook;

    public Student() {
    }
    public Student(String fullName, String gender, Date birthday, Boolean isOnBudget, Department department,
                   EducationType type, RecordBook recordBook) {
        super(fullName, gender, birthday);
        this.isOnBudget = isOnBudget;
        this.department = department;
        this.type = type;
        this.recordBook = recordBook;
    }

    public Boolean getOnBudget() {
        return isOnBudget;
    }

    public void setOnBudget(Boolean onBudget) {
        isOnBudget = onBudget;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public EducationType getType() {
        return type;
    }

    public void setType(EducationType type) {
        this.type = type;
    }

    public RecordBook getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(RecordBook recordBook) {
        this.recordBook = recordBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return isOnBudget.equals(student.isOnBudget) && department.equals(student.department) && type == student.type && recordBook.equals(student.recordBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOnBudget, department, type, recordBook);
    }

    @Override
    public String toString() {
        return "Student{" +
                "isOnBudget=" + isOnBudget +
                ", department=" + department +
                ", type=" + type +
                ", recordBook=" + recordBook +
                '}';
    }
}
