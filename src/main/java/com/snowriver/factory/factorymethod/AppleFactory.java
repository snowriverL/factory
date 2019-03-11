package com.snowriver.factory.factorymethod;

import com.snowriver.factory.simplefactory.Apple;
import com.snowriver.factory.simplefactory.IFruit;

public class AppleFactory implements IFruitFactory{
    public IFruit produce() {
        return new Apple();
    }
}
