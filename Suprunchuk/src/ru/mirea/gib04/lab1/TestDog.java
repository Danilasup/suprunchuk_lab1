package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Geon", 2);
        Dog d2 = new Dog("Kyu", 4);
        Dog d3 = new Dog("Yeo");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}