package ru.kurochkina.neoflex.model;

import java.math.RoundingMode;

public class Calculator {
    private int salary;
    private int days;
    private double result;

    public Calculator() {
    }

    public Calculator(int salary, int days) {
        this.salary = salary;
        this.days = days;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getResult() {
        if(this.salary <= 0 || this.days <= 0) {
            result = 0.0;
        }
        else {
            result  = (this.salary /29.3) * this.days;

        }
        return (double)(Math.round( result*10))/10;
    }


}
