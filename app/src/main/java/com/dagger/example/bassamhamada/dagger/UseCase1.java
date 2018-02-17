package com.dagger.example.bassamhamada.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.DataProvider;
import com.dagger.example.bassamhamada.dagger.dependencies.DataProviderSingleton2;
import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataInjector;

import javax.inject.Inject;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class UseCase1 {

    @Inject
    DataProvider dataProvider;

    public UseCase1() {

        DataInjector.getComponent().inject(this);
    }

    public int add() {

        int result = dataProvider.getFirstNum() +
                dataProvider.getSecondNum();
        dataProvider.setResult1(result);

        return result;
    }

    public int subtract() {

        int result = dataProvider.getFirstNum() -
                dataProvider.getSecondNum();
        dataProvider.setResult2(result);

        return result;
    }
}
