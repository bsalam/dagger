package com.dagger.example.bassamhamada.dagger.dependencies.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.DataProvider;
import com.dagger.example.bassamhamada.dagger.dependencies.DataProviderImpl2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bassamhamada on 2/7/18.
 */

@Module
public class DataModule2 {

    @Provides
    @Singleton
    public DataProvider getDataProvider() {

        return new DataProviderImpl2();
    }
}
