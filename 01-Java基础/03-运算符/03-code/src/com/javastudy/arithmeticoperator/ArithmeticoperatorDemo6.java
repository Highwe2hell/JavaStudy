package com.javastudy.arithmeticoperator;

public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        // x++ 先用后加
        // ++x 先加后用
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
