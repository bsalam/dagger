package com.dagger.example.bassamhamada.dagger.dependencies;

/**
 * Created by bassamhamada on 2/7/18.
 */

public interface DataProvider {

    int getFirstNum();

    int getSecondNum();

    void setResult1(int result);

    void setResult2(int result);

    int getResult1();

    int getResult2();
}
