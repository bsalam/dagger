package com.dagger.example.bassamhamada.dagger.dagger;

import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataComponent1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bassamhamada on 2/7/18.
 */

@Component(modules = {DataModuleTest.class})
@Singleton
public interface DataComponentTest extends DataComponent1 {

}
