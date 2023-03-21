package com.code.yem.effectiveJava.commonMethod;

/**
 * @Author ym
 * @Date 2023/3/13 23:29
 * @Description:yem
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }
        if (obj instanceof String) {
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "ab";
        CaseInsensitiveString str1 = new CaseInsensitiveString("Ab");
        System.out.println(str1.equals(str));
        System.out.println(str.equals(str1));

    }
}
