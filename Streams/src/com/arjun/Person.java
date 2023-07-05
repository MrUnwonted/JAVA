package com.arjun;

public class Person {

    private String name;
    private String Gender;
    private Integer Age;
    private Integer Salary;

    int a = 10;

    public void add(){
        int a = 100;
        System.out.println(this.a);
        System.out.println(a);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                '}';
    }
}
