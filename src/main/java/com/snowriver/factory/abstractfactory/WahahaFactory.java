package com.snowriver.factory.abstractfactory;

import com.snowriver.factory.simplefactory.IFruit;
import com.snowriver.factory.simplefactory.Orange;

public class WahahaFactory implements ColligateFactory{
    public IFruit createFruit() {
        return new Orange();
    }

    public IVegetables createVegetables() {
        return new WahahaVegetables();
    }

    public IWater creatWater() {
        return new WahahaWater();
    }
}
