package com.solvd.people;

import com.solvd.RecordBook;
import com.solvd.enums.EducationType;
import com.solvd.enums.Gender;

import java.util.Date;
import java.util.Objects;

public class Student extends Person {
    private Boolean isOnBudget;
    private EducationType type;
    private RecordBook recordBook;

    public Student() {
    }

    public Student(String fullName, Gender gender, Date birthday, Boolean isOnBudget, EducationType type,
                   RecordBook recordBook) {
        super(fullName, gender, birthday);
        this.isOnBudget = isOnBudget;
        this.type = type;
        this.recordBook = recordBook;
    }

    public Boolean getOnBudget() {
        return isOnBudget;
    }

    public void setOnBudget(Boolean onBudget) {
        isOnBudget = onBudget;
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
        return isOnBudget.equals(student.isOnBudget) && type == student.type && recordBook.equals(student.recordBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOnBudget, type, recordBook);
    }

    @Override
    public String toString() {
        return "Student{" +
                "isOnBudget=" + isOnBudget +
                ", type=" + type +
                ", recordBook=" + recordBook +
                "} " + super.toString();
    }
}
