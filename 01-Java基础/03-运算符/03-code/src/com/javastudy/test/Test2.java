package com.javastudy.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // ����
        // ��������Լ���������ͼ�ڲ������һ�����ӡ�
        // ����¼��������������ʾ�����Լ������·���ʱ�ֶȡ����ֶ�¼��0~10֮�������������¼������
        // ������ʱ�̶ֳȴ���������ʱ�̶ֳȣ����׾ͳɹ������true��
        // �������false��

        // 1.����¼������������ʾ�·���ʱ�ֶ�
        Scanner sc = new Scanner(System.in);
        System.out.println("���������·���ʱ�̶ֳ�");
        int myFashion = sc.nextInt();
        System.out.println("��������Լ������·���ʱ�̶ֳ�");
        int girlFashion = sc.nextInt();

        // 2.�Ƚ�
        boolean result = myFashion > girlFashion;

        // 3.������
        System.out.println(result);
    }
}
