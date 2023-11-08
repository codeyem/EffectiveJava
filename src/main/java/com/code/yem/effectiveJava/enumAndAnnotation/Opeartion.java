package com.code.yem.effectiveJava.enumAndAnnotation;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author ym
 * @Date 2023/11/8 22:39
 * @Description:yem
 */
public enum Opeartion {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Opeartion(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);

    private static final Map<String, Opeartion> stringToEnums = Stream.of(values()).collect(Collectors.toMap(Objects::toString, e -> e));

    public static Optional<Opeartion> fromString(String symbol) {
        return Optional.ofNullable(stringToEnums.get(symbol));
    }
}

