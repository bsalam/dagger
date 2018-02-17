package com.dagger.example.bassamhamada.dagger.dependencies;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class DataProviderImpl1 implements DataProvider {

    private int result1;

    private int result2;

    @Override
    public int getFirstNum() {
        return 20;
    }

    @Override
    public int getSecondNum() {
        return 30;
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
