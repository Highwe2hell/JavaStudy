package com.javastudy.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        // 1.&&��·��
        System.out.println(true & true);// true
        System.out.println(false & false);// false
        System.out.println(true & false);// false
        System.out.println(false & true);// false

        // 2.||��·��
        System.out.println(true | true);// true
        System.out.println(false | false);// false
        System.out.println(true | false);// true
        System.out.println(false | true);// true

        // 3.��·�߼���������ж�·Ч��
        // ����⣺����ߵı��ʽ��ȷ�����յĽ������ô�ұ߾Ͳ������������
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);// false
        System.out.println(a);// 11
        System.out.println(b);// 10
    }
}
