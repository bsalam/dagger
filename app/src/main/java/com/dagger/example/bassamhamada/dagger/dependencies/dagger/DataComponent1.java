package com.dagger.example.bassamhamada.dagger.dependencies.dagger;

import com.dagger.example.bassamhamada.dagger.UseCase1;
import com.dagger.example.bassamhamada.dagger.UseCase2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bassamhamada on 2/7/18.
 */

@Component(modules = {DataModule1.class})
@Singleton
public interface DataComponent1 {

    void inject(UseCase1 useCase);

    void inject(UseCase2 useCase2);

}
