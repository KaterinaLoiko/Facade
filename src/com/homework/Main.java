package com.homework;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Умножение 2 на 3 в двоичной системе");
        System.out.println(bins.mult(Integer.toBinaryString(2), Integer.toBinaryString(3)));
    }
}
