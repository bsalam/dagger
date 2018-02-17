package com.dagger.example.bassamhamada.dagger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataInjector;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private static UseCase1 useCase;

    @BeforeClass
    public static void setup() {

        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext().getApplicationContext();
        DataInjector.createComponent(appContext);

        useCase = new UseCase1();
    }

    @AfterClass
    public static void tearDown() {

        // Context of the app under test.
        DataInjector.releaseComponent();
    }

    @Test
    public void testUseCase1Add() {

        assertEquals(500, useCase.add());
    }

    @Test
    public void testUseCase1Subtract() {

        assertEquals(-200, useCase.subtract());
    }
}
