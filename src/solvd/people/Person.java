package solvd.people;

import java.util.Date;
import java.util.Objects;

public abstract class Person {
    private String fullName;
    private String gender;
    private Date birthday;

    public Person(){

    }
    public Person(String fullName, String gender, Date birthday) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) && gender.equals(person.gender) && birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, gender, birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
