package com.javastudy.assigningoperator;

public class AssigningoperatorDemo {
    public static void main(String[] args) {
        // +=
        // 规则：将左边和右边进行相加，然后把结果赋值给左边
        int a = 10;
        int b = 20;
        a += b;// 等价于a = a + b;
        System.out.println(a);
        System.out.println(b);

        // 细节：
        //+= -= *= /= %= 底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1;// 等价于s = (short) (s + 1);
        System.out.println(s);
    }
}
