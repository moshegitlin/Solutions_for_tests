package Homework_java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(9);
        System.out.println(n);
    }
}
