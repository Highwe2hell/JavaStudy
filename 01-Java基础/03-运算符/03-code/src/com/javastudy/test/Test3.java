package com.javastudy.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*����6��һ������ΰ������֣�����¼������������
        �������һ��Ϊ6�����ս�����true��
        ������ǵĺ�Ϊ6�ı��������ս�����true��
        �����������false��*/

        // ����¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int number1 = sc.nextInt();
        System.out.println("������ڶ�������");
        int number2 = sc.nextInt();

        // ���Զ�·�߼������ȥ���������ж�
        // �����������һ������ô�Ϳ������true
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
