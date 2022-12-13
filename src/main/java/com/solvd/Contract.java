package com.solvd;

import com.solvd.people.Student;

import java.util.Date;
import java.util.Objects;

public class Contract {
    private String number;
    private Date startDate;
    private Date endDate;
    private int amount;
    private Student student;

    public Contract(){

    }

    public Contract(String number, Date startDate, Date endDate, int amount, Student student) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.student = student;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return amount == contract.amount && number.equals(contract.number) && startDate.equals(contract.startDate) && endDate.equals(contract.endDate) && student.equals(contract.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, startDate, endDate, amount, student);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number='" + number + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", amount=" + amount +
                ", student=" + student +
                '}';
    }
}
