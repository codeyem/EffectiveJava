package com.code.yem.effectiveJava.enumAndAnnotation;

/**
 * @Author ym
 * @Date 2023/11/14 22:30
 * @Description:yem
 */
public enum PayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SATURADAY(PayType.WEEKDAY), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType){
        this.payType = payType;
    }

    PayrollDay(){
        this(PayType.WEEKDAY);
    }

    int pay(int mins, int payRate){
        return payType.pay(mins, payRate);
    }


    private enum PayType{
        WEEKDAY{
            @Override
            int overtimeDay(int mins, int payRate) {
                return mins <= MINS_PER_SHIFT ? 0 :(mins - MINS_PER_SHIFT) * payRate / 2;
            }
        },

        WEEKEND{
            @Override
            int overtimeDay(int mins, int payRate) {
                return mins * payRate / 2;
            }
        };

        private static final int MINS_PER_SHIFT = 8 * 60;
        abstract int overtimeDay(int mins, int payRate);

        int pay(int mins, int payRate){
            int baseDay = mins * payRate;
            return baseDay + overtimeDay(mins, payRate);
        }
    }
}
