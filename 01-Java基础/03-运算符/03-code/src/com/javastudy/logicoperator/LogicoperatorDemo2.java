package com.javastudy.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // 1.^�����ͬΪfalse����ͬΪtrue
        System.out.println(true ^ true);// false
        System.out.println(false ^ false);// false
        System.out.println(true ^ false);// true
        System.out.println(false ^ true);// true

        // 2.!��
        System.out.println(!false);// true
        System.out.println(!true);// false
    }
}
