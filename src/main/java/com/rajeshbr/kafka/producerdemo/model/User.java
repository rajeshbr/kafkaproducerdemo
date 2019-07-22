package com.rajeshbr.kafka.producerdemo.model;

import java.math.BigDecimal;

public class User {
    private String name;
    private BigDecimal salary;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public User(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", salary=" + salary + "]";
    }

}