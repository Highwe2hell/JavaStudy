package com.javastudy.test;

public class Test5 {
    public static void main(String[] args) {
        /* ����һ��������ס���������У���֪���ǵ���߷ֱ�Ϊ150cm��210cm��165cm��
        ���ó���ʵ�ֻ�ȡ���������е������ߡ�*/

        // 1.��������������¼�������е����
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        // 2.���ŵ�һ�����к͵ڶ������н��бȽ�
        // �����Ž�������������н��бȽϼ���
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
