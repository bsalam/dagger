package com.dagger.example.bassamhamada.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.DataProvider;
import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataInjector;

import javax.inject.Inject;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class UseCase2 {

    @Inject
    DataProvider dataProvider;

    public UseCase2() {

        DataInjector.getComponent().inject(this);
    }

    public int add() {

        return dataProvider.getResult1();

    }

    public int subtract() {

        return dataProvider.getResult2();
    }
}
