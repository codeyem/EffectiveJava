package com.code.yem.effectiveJava.objectLifeCycle;

import java.util.Objects;

/**
 * @Author ym
 * @Date 2023/3/6 22:55
 * @Description:yem
 */
public class NyPizza extends Pizza{
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Buidler extends Pizza.Builder<Buidler>{
        private final Size size;
        public Buidler(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Buidler self() {
            return this;
        }
    }

    NyPizza(Buidler builder) {
        super(builder);
        this.size = builder.size;
    }

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Buidler(Size.SMALL).addTopping(Topping.SASSAGE).addTopping(Topping.SASSAGE).build();
        System.out.printf(nyPizza.toString());
    }

}
