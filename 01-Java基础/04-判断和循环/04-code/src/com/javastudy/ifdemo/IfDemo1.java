package com.javastudy.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        // ���󣺼���¼��Ů��������������� 2 ������˸�����Ӧ����֮����Ӧ

        // 1.����¼��Ů���ľ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ů���ľ���");
        int wine = sc.nextInt();
        // 2.�Ծ��������ж�
        if (wine > 2) {
            System.out.println("С���ӣ�������");
        }
    }
}
