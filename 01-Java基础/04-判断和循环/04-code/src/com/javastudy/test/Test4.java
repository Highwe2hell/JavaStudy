package com.javastudy.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
       /* ����
        ���裬�û��ڳ���ʵ�ʹ�����Ʒ�ܼ�Ϊ��600Ԫ��
        ����¼��һ��������ʾ�û�ʵ��֧����Ǯ��
        ���������ڵ���600����ʾ����ɹ������򸶿�ʧ�ܡ�*/

        // 1.����¼��һ��������ʾ�û�ʵ��֧����Ǯ��
        Scanner sc = new Scanner(System.in);
        System.out.println("¼��������ʾ�û�ʵ��֧����Ǯ");
        int money = sc.nextInt();

        // 2.�ж�
        if (money >= 600) {
            System.out.println("����ɹ�");
        } else {
            System.out.println("����ʧ��");
        }
    }
}
