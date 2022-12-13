package com.solvd;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RecordBook {
    private String number;
    private Map<Subject, List<Integer>> marks;

    public RecordBook(){}

    public RecordBook(String number, Map<Subject, List<Integer>> marks) {
        this.number = number;
        this.marks = marks;
    }

    public RecordBook(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Map<Subject, List<Integer>> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subject, List<Integer>> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordBook that = (RecordBook) o;
        return number.equals(that.number) && marks.equals(that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, marks);
    }

    @Override
    public String toString() {
        return "RecordBook{" +
                "number='" + number + '\'' +
                ", marks=" + marks +
                '}';
    }
}
