package com.javastudy.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        // 1.&”Î
        System.out.println(true & true);// true
        System.out.println(false & false);// false
        System.out.println(true & false);// false
        System.out.println(false & true);// false

        // 2.|ªÚ
        System.out.println(true | true);// true
        System.out.println(false | false);// false
        System.out.println(true | false);// true
        System.out.println(false | true);// true
    }
}
