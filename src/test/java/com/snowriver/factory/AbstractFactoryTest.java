package com.snowriver.factory;

import com.snowriver.factory.abstractfactory.ColligateFactory;
import com.snowriver.factory.abstractfactory.KangFactory;
import com.snowriver.factory.abstractfactory.WahahaFactory;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void TestFactory() {
        ColligateFactory factory = new KangFactory();
        factory.createFruit().publish();
        factory.createVegetables().raise();
        factory.creatWater().publish();

        System.out.println("===================================");

        factory = new WahahaFactory();
        factory.createFruit().publish();
        factory.createVegetables().raise();
        factory.creatWater().publish();
    }

}
