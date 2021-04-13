package com.lilin.basic;

public class TestDemo {

    public static void main(String[] args) {

        int i = 1;
        int j = i++;
        System.out.println(i++);

        if ((j > ++j) && (i++ == i)) {
            j += i;

        }

        methods("hello", "java");
        System.out.println(j);
    }


    public static void methods(String i, String j) {
        String name = i + "_" + j;
        System.out.println(name);
    }
}
