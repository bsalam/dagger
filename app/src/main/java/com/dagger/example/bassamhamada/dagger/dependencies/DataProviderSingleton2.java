package com.dagger.example.bassamhamada.dagger.dependencies;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class DataProviderSingleton2 implements DataProvider {

    private static DataProviderSingleton2 instance;

    private int result1;
    private int result2;

    private DataProviderSingleton2() {
    }

    public static DataProviderSingleton2 getInstance() {

        if (instance == null) {
            instance = new DataProviderSingleton2();
        }

        return instance;
    }

    @Override
    public int getFirstNum() {
        return 20;
    }

    @Override
    public int getSecondNum() {
        return 10;
    }

    @Override
    public void setResult1(int result) {
        this.result1 = result;
    }

    @Override
    public void setResult2(int result) {
        this.result2 = result;
    }

    @Override
    public int getResult1() {
        return result1;
    }

    @Override
    public int getResult2() {
        return result2;
    }
}
