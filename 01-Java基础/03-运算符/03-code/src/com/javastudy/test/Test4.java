package com.javastudy.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
         /* 需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。*/

        // 1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int w1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int w2 = sc.nextInt();
        // 2.比较
        String res = w1 == w2 ? "相同" : "不同";
        System.out.println(res);
    }
}
