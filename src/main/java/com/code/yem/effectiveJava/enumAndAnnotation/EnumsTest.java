package com.code.yem.effectiveJava.enumAndAnnotation;

/**
 * @Author ym
 * @Date 2023/11/8 22:56
 * @Description:yem
 */

public class EnumsTest {
    public static void main(String[] args) {
        opeartionTest();
    }



    public static void opeartionTest(){
        System.out.println(Opeartion.fromString("-").get().apply(2,7));
    }

}
