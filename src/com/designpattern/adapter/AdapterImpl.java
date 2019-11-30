package com.designpattern.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
//        return (float) Math.twoTime(f.doubleValue());
        return (float) Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f){
        System.out.println("Start halfOf function.");
        return (float) Math.half(f.doubleValue());
    }
}
