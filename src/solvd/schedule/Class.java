package solvd.schedule;

import solvd.Audience;
import solvd.Group;
import solvd.Subject;
import solvd.people.Teacher;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Class {
    private Subject subject;
    private List<Group> groups;
    private Teacher lecturer;
    private Audience audience;
    private Date time;

    public Class (){

    }

    public Class(Subject subject, List<Group> groups, Teacher lecturer, Audience audience, Date time) {
        this.subject = subject;
        this.groups = groups;
        this.lecturer = lecturer;
        this.audience = audience;
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Teacher getLecturer() {
        return lecturer;
    }

    public void setLecturer(Teacher lecturer) {
        this.lecturer = lecturer;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return subject.equals(aClass.subject) && groups.equals(aClass.groups) && lecturer.equals(aClass.lecturer) && audience.equals(aClass.audience) && time.equals(aClass.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, groups, lecturer, audience, time);
    }

    @Override
    public String toString() {
        return "Class{" +
                "subject=" + subject +
                ", groups=" + groups +
                ", lecturer=" + lecturer +
                ", audience=" + audience +
                ", time=" + time +
                '}';
    }
}
