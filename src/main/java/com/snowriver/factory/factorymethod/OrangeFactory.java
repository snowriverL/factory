package com.snowriver.factory.factorymethod;

import com.snowriver.factory.simplefactory.IFruit;
import com.snowriver.factory.simplefactory.Orange;

public class OrangeFactory implements IFruitFactory{
    public IFruit produce() {
        return new Orange();
    }
}
