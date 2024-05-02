package com.javastudy.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位，十位百位

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        // 2.获取个位，十位，百位
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}
