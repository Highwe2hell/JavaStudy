package com.javastudy.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // ����¼��һ����λ������ȡ���еĸ�λ��ʮλ��λ

        // 1.����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����λ��");
        int num = sc.nextInt();

        // 2.��ȡ��λ��ʮλ����λ
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("��λ�ǣ�" + ge);
        System.out.println("ʮλ�ǣ�" + shi);
        System.out.println("��λ�ǣ�" + bai);
    }
}
