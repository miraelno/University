package solvd;

import solvd.people.Teacher;

import java.util.List;
import java.util.Objects;

public class Subject {
    private String name;
    private List<Teacher> lecturers;

    public Subject(){

    }

    public Subject(String name, List<Teacher> lecturers) {
        this.name = name;
        this.lecturers = lecturers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Teacher> lecturers) {
        this.lecturers = lecturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return name.equals(subject.name) && lecturers.equals(subject.lecturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lecturers);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", lecturers=" + lecturers +
                '}';
    }
}
