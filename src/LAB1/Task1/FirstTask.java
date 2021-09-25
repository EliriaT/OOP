package com.company.LAB1.Task1;

public class FirstTask {

    public static void main(String[] args) {

        Monitor first_monitor = new Monitor();
        first_monitor.color = "Black";
        first_monitor.dimensions = "Large";
        first_monitor.width = 1940;
        first_monitor.height = 1450;
        System.out.println("Caracteristicele primului monitor sunt: " + first_monitor.color + " " + first_monitor.dimensions + " " + first_monitor.width + "x" + first_monitor.height);
        Monitor second_monitor = new Monitor();
        second_monitor.color = "White";
        second_monitor.dimensions = "Medium";
        second_monitor.width = 1024;
        second_monitor.height = 768;

        Monitor first2_monitor = new Monitor();
        first_monitor.color = "Black";
        first_monitor.dimensions = "Large";
        first_monitor.width = 1940;
        first_monitor.height = 1450;


        System.out.println("Caracteristicele celui de-a doilea monitor sunt: " + second_monitor.color + " " + second_monitor.dimensions + " " + second_monitor.width + "x" + second_monitor.height);
        if(first_monitor.equals(first2_monitor))
        {
            System.out.println("Monitoarele sunt la fel");
        }
        else
        {
            System.out.println("Monitoarele sunt diferite");

        }
    }
}
