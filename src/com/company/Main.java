package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        int length = 3;
        int width = 5;
        int height = 7;
        int volue = length * width * height;
        System.out.println(volue + " объем");
        int arrea = length * width;
        System.out.println(arrea + " плосчадь");

        Box yaschik = new Box(3, 5, 7);
        System.out.println(yaschik);
        yaschik.setLength(10);
        System.out.println(yaschik.getVolume());

        System.out.println(yaschik.isCube());

        Box korobka = new Box(5, 5, 5);
        System.out.println(korobka.isCube());
        System.out.println(korobka);

        Student iGor = new Student("Igor", "Novikov", "Uriyovich",
                LocalDate.of(2015, Month.JULY, 5), "Male",
                LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(iGor.isAdult());
        System.out.println(iGor.isMilitary());

    }
}
