package com.javastudy.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*���ݲ�ͬ�ķ����Ͳ�ͬ�����
        �����95~100�֣������г�һ��
        �����90~94�֣����ֳ���һ��
        �����80~89�֣��ͱ��ν��һ����
        �����80�֣���һ�١�*/

        // ������
        // 1.����¼��С���Ŀ��Գɼ�
        Scanner sc = new Scanner(System.in);
        System.out.println("��¼��һ��������ʾС���ĳɼ�");
        int score = sc.nextInt();

        // ���쳣���ݽ����ж�У��
        // 0~100��������
        if (score > 0 && score <= 100) {
            // 2.���ݲ�ͬ�Ŀ��Գɼ�,������ͬ�Ľ���
            if (score >= 95 && score <= 100) {
                System.out.println("�����г�һ��");
            } else if (score >= 90 && score <= 94) {
                System.out.println("���ֳ���һ��");
            } else if (score >= 80 && score <= 89) {
                System.out.println("�ͱ��ν��һ��");
            } else {
                System.out.println("��һ��");
            }
        } else {
            System.out.println("��ǰ¼��ĳɼ����Ϸ�");
        }
    }
}
