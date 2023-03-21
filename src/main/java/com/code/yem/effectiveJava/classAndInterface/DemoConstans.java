package com.code.yem.effectiveJava.classAndInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author ym
 * @Date 2023/3/18 23:48
 * @Description:yem
 */
public class DemoConstans {
    private static final String[] STRS = {"1", "@", "3"};

    public static final List<String> values = Collections.unmodifiableList(Arrays.asList(STRS));
}
