package com.dagger.example.bassamhamada.dagger.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.DataProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bassamhamada on 2/7/18.
 */

@Module
public class DataModuleTest {

    @Provides
    public DataProvider getDataProvider() {

        return new DataProviderImplTest();
    }
}
