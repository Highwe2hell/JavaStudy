package com.javastudy.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
         /* ���󣺶���԰������ֻ�ϻ������طֱ�Ϊͨ������¼���ã�
        ���ó���ʵ���ж���ֻ�ϻ��������Ƿ���ͬ��*/

        // 1.����¼����ֻ�ϻ�������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һֻ�ϻ�������");
        int w1 = sc.nextInt();
        System.out.println("������ڶ�ֻ�ϻ�������");
        int w2 = sc.nextInt();
        // 2.�Ƚ�
        String res = w1 == w2 ? "��ͬ" : "��ͬ";
        System.out.println(res);
    }
}
