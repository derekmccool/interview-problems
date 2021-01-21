package com.djm;

public class SwitchValues {
    public static void main(String[] args) {
        int i = 2;
        int j = 4;
        System.out.println("i =" + i);
        System.out.println("j =" + j);

        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("i =" + i);
        System.out.println("j =" + j);

    }
}
