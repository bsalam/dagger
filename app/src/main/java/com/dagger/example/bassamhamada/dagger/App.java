package com.dagger.example.bassamhamada.dagger;

import android.app.Application;

import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DaggerDataComponent1;
import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataComponent1;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class App extends Application {

    public DataComponent1 createDataComponent() {

        return DaggerDataComponent1
                .create();
    }
}
