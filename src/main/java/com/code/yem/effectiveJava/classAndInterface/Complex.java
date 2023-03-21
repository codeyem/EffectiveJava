package com.code.yem.effectiveJava.classAndInterface;

/**
 * @Author ym
 * @Date 2023/3/21 22:21
 * @Description:yem
 */
public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPary() {
        return im;
    }

    public Complex plux(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }
}
