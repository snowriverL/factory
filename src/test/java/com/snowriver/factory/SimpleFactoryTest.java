package com.snowriver.factory;

import com.snowriver.factory.simplefactory.Apple;
import com.snowriver.factory.simplefactory.FruitPublishFactory;
import com.snowriver.factory.simplefactory.IFruit;
import com.snowriver.factory.simplefactory.Orange;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void TestSimple() {

        FruitPublishFactory factory = new FruitPublishFactory();
        IFruit apple = factory.create(Apple.class);
        apple.publish();
        System.out.println("===========================");
        IFruit orange = factory.create(Orange.class);
        orange.publish();

    }

}
