package com.dagger.example.bassamhamada.dagger.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.DataProvider;
import com.dagger.example.bassamhamada.dagger.dependencies.DataProviderImpl1;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class DataProviderImplTest extends DataProviderImpl1 {

    @Override
    public int getFirstNum() {
        return 200;
    }

    @Override
    public int getSecondNum() {
        return 400;
    }
}
