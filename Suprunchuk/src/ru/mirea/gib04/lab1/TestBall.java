package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(26.2, "Green", "football", 5000);
        Ball b2 = new Ball(27.8, "Yellow", "basketball", 6000);
        Ball b3 = new Ball(28.7, "black", "volleyball", 4000);
        b3.setColor("red");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}