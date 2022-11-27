package solvd;

import solvd.people.Student;
import solvd.people.Teacher;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher curator;

    public Group(){

    }

    public Group(String name, List<Student> students, Teacher curator) {
        this.name = name;
        this.students = students;
        this.curator = curator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name.equals(group.name) && students.equals(group.students) && curator.equals(group.curator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students, curator);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", curator=" + curator +
                '}';
    }
}
