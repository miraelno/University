package com.solvd;

import com.solvd.enums.Course;
import com.solvd.interfaces.Filterable;
import com.solvd.people.Student;
import com.solvd.people.Teacher;

import java.util.List;
import java.util.Objects;

public class Group implements Filterable {
    private String name;
    private Course course;
    private List<Student> students;
    private Teacher curator;

    public Group(){

    }

    public Group(String name, Course course, List<Student> students, Teacher curator) {
        this.name = name;
        this.course = course;
        this.students = students;
        this.curator = curator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return name.equals(group.name) && course == group.course && students.equals(group.students) && curator.equals(group.curator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, students, curator);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", students=" + students +
                ", curator=" + curator +
                '}';
    }
}
