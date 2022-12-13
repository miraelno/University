package com.solvd.schedule;

import com.solvd.interfaces.Filterable;

import java.util.List;
import java.util.Objects;

public class Schedule implements Filterable {
    private List<Class> classes;

    public Schedule(){

    }
    public Schedule(List<Class> classes) {
        this.classes = classes;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return classes.equals(schedule.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classes);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "classes=" + classes +
                '}';
    }
}
