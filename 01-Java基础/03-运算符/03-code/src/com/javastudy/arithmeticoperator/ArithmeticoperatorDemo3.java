package com.javastudy.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        // byte,char,short在运算的时候，会自动转为int
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);
        System.out.println(result);
    }
}