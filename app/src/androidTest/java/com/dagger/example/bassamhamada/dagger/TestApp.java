package com.dagger.example.bassamhamada.dagger;

import com.dagger.example.bassamhamada.dagger.dagger.DaggerDataComponentTest;
import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataComponent1;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class TestApp extends App {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public DataComponent1 createDataComponent() {
        return DaggerDataComponentTest
                .create();
    }
}
