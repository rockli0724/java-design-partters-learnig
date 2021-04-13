package com.lilin.basic;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Test_Basic_data {

    static String hell = "helloworldadasdad";
    static int arrar[] = new int[5];

    public static void main(String[] args) throws Exception {


//        String s = new String("1" + "2");
//        System.out.println(s);
//        Float f1 = new Float("10F");
//        Float f2 = new Float("10F");
//        Double d = new Double("10D");
//        System.out.println(f1 == f2);
//        System.out.println(f1.equals(f2));
//        System.out.println(f2.equals(d));
//        System.out.println("f2=" + f2 + ", d=" + d);
//        System.out.println(f2.equals(new Float("10")));
//
//        System.out.println(arrar[0]);
//        int x = 4;
//        System.out.println("value is " + ((x > 4) ? 99.9 : 9));
//
//

        par();


    }

    public static double par() {
        try {
            String a = "Programming";
            String b = new String("Programming");
            String c = "Progr" + "amming";
            System.out.println(a == b);//false
            System.out.println(a == c);//true
            System.out.println(a.equals(b));//true
            System.out.println(a.equals(c));//true
            System.out.println(a.intern() == b.intern());//true


            byte xc = 2;
            double y = 2;
            System.out.println((short) xc / y * 2);
            return 3d;
        } finally {
            System.out.println("final");
        }

    }

}
