package com.javastudy.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*��ʵ�ʿ����У���ӰԺѡ��Ҳ��ʹ�õ�if�жϡ�
        ����ĳӰԺ������100��Ʊ��Ʊ�����Ϊ1~100��
        ��������Ʊ������࣬ż��Ʊ�����Ҳࡣ
        ����¼��һ��������ʾ��ӰƱ��Ʊ�š�
        ���ݲ�ͬ�����������ͬ����ʾ��
        ���Ʊ��Ϊ��������ô��ӡ�����
        ���Ʊ��Ϊż������ô��ӡ���ұߡ�*/

        // 1.����¼��һ��������ʾ��ӰƱ��Ʊ�š�
        Scanner sc = new Scanner(System.in);
        System.out.println("��¼��һ��Ʊ��");
        int ticket = sc.nextInt();
        // ֻ�е�ticket��0 ~ 100֮�䣬������ʵ��Ч��Ʊ
        // if��Ƕ��
        if (ticket >= 0 && ticket <= 100) {
            // 2.�ж�Ʊ������������ż��
            if (ticket % 2 == 1) {
                System.out.println("�����");
            } else {
                System.out.println("���ұ�");
            }
        }
    }
}
