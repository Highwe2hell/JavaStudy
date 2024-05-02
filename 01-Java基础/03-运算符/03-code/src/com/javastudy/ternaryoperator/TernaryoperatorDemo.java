package com.javastudy.ternaryoperator;

public class TernaryoperatorDemo {
    public static void main(String[] args) {
        // 需求：使用三元运算符，获取两个数的较大值
        int n1 = 10;
        int n2 = 20;
        int max = n1 > n2 ? n1 : n2;
        System.out.println(max);
        System.out.println(n1 > n2 ? n1 : n2);
    }
}
