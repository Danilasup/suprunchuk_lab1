package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Бойцовский Клуб", "Паланик Чак", 160, "Роман");
        Book b2 = new Book("1984", "Дж. Оруэлл", 320, "Антиутопия");
        Book b3 = new Book("Королевская Битва", "Косюн Таками", 629, "Боевик");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}