package com.javastudy.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*���󣺼���¼��һ����������ʾ���ϵ�Ǯ��
        ������ڵ���100�飬�������������
        ���򣬾ͳԾ���ʵ�ݵ�ɳ��С�ԡ�*/
        
        // ������
        // 1.����¼��һ����������ʾ���ϵ�Ǯ��
        Scanner sc = new Scanner(System.in);
        System.out.println("��¼�����ϵ�Ǯ");
        int money = sc.nextInt();
        // 2.��Ǯ�����жϣ���ѡһ��
        if (money >= 100) {
            System.out.println("���������");
        } else {
            System.out.println("�Ծ���ʵ�ݵ�ɳ��С��");
        }
    }
}
