package com.dagger.example.bassamhamada.dagger.dependencies.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bassamhamada on 2/7/18.
 */

@Component(modules = {DataModule2.class})
@Singleton
public interface DataComponent2 extends DataComponent1 {

}
