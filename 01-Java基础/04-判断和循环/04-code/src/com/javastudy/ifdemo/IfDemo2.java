package com.javastudy.ifdemo;

/*
    if(��ϵ���ʽ){
        �����;
    }

    if��ע��㣺
        1.�����ŵĿ�ͷ��������һ����д�����ǽ���д�ڵ�һ�е�ĩβ
        2.��������У����ֻ��һ����룬�����ſ���ʡ�Բ�д�����˽��飬�����Ż��ǲ�Ҫʡ��
        3.�����һ���������͵ı��������жϣ���Ҫ��==�ţ�ֱ�Ӱѱ���д��С���ż���
*/
public class IfDemo2 {
    public static void main(String[] args) {
        int number = 20;
        if (number >= 10)
            // int a = 100; �൱��������룺1.�������a 2.������a��ֵΪ100
            System.out.println("number���ڵ���10");

        boolean flag = true;
        if (flag) {
            System.out.println("flag��ֵΪtrue");
        }
    }
}
