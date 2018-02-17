package com.dagger.example.bassamhamada.dagger.dependencies.dagger;

import android.content.Context;

import com.dagger.example.bassamhamada.dagger.App;

/**
 * Created by bassamhamada on 2/7/18.
 */

public class DataInjector {

    private static DataComponent1 component;

    public static void createComponent(Context context) {

//        component = DaggerDataComponent1
//                .create();
//        component = DaggerDataComponent1
//                .builder()
//                .dataModule1(new DataModule1())
//                .build();

        component = ((App) context).createDataComponent();

    }

    public static void releaseComponent() {

        component = null;
    }

    public static DataComponent1 getComponent() {

        return component;
    }
}
