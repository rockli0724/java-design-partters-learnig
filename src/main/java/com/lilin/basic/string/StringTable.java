package com.lilin.basic.string;

public class StringTable {

    //["a","b","ab",]
    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b";
        String s4 = s1 + s2;//new String("ab")
        String s5 = "ab";
        String s6 = s4.intern();
        //question

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true

        String x1 = new String("c") + new String("d");//String("cd")
        String x2 = "cd";
        x2.intern();

        System.out.println(x1 == x2);//true
    }
}
