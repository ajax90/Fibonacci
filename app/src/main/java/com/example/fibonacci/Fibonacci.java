package com.example.fibonacci;

public class Fibonacci {
    int id;
    String number;

    public Fibonacci() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
