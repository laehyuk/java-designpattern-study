package com.designpattern.adapter;

public interface Adapter {

    /**
     * 수의 두 배의 수를 반환 : twiceOf(Float):Float
     * 수의 반(1/2)의 수를 반환 : halfOf(Float):Float
     *
     * @return*/

    public Float twiceOf( Float f);

    public Float halfOf(Float f);

}
