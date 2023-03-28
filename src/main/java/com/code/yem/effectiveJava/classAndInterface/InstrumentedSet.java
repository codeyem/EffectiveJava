package com.code.yem.effectiveJava.classAndInterface;

import java.util.Collection;
import java.util.Set;

/**
 * @Author ym
 * @Date 2023/3/28 22:35
 * @Description:yem
 */
public class InstrumentedSet<T> extends ForwardingSet<T> {
    private int addCount = 0;

    public InstrumentedSet(Set<T> s) {
        super(s);
    }

    @Override
    public boolean add(T t) {
        addCount++;
        return super.add(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
