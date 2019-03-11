package com.snowriver.factory.abstractfactory;

import com.snowriver.factory.simplefactory.Apple;
import com.snowriver.factory.simplefactory.IFruit;

public class KangFactory implements ColligateFactory{
    public IFruit createFruit() {
        return new Apple();
    }

    public IVegetables createVegetables() {
        return new KangVegetables();
    }

    public IWater creatWater() {
        return new KangWater();
    }
}
