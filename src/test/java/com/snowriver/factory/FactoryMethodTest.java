package com.snowriver.factory;

import com.snowriver.factory.factorymethod.AppleFactory;
import com.snowriver.factory.factorymethod.IFruitFactory;
import com.snowriver.factory.factorymethod.OrangeFactory;
import com.snowriver.factory.simplefactory.Apple;
import com.snowriver.factory.simplefactory.FruitPublishFactory;
import com.snowriver.factory.simplefactory.IFruit;
import com.snowriver.factory.simplefactory.Orange;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void TestFactoryMethod() {

        IFruitFactory factory = new AppleFactory();
        IFruit fruit = factory.produce();
        fruit.publish();

        System.out.println("================================");

        factory = new OrangeFactory();
        fruit = factory.produce();
        fruit.publish();

    }

}
