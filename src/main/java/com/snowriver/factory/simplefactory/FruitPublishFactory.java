package com.snowriver.factory.simplefactory;

public class FruitPublishFactory {

    public IFruit create(Class<? extends IFruit> clazz) {

        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
