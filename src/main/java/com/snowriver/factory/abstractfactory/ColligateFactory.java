package com.snowriver.factory.abstractfactory;


import com.snowriver.factory.simplefactory.IFruit;

/**
 * 抽象工厂是用户得主入口
 * String中应用最广泛得一种设计模式
 * 易于扩展
 */
public interface ColligateFactory {

    IFruit createFruit();

    IVegetables createVegetables();

    IWater creatWater();

}
