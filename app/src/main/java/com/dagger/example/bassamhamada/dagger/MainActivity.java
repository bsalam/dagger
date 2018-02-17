package com.dagger.example.bassamhamada.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.dagger.example.bassamhamada.dagger.dependencies.dagger.DataInjector;

public class MainActivity extends AppCompatActivity {

    private UseCase1 useCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // build dagger component
        DataInjector.createComponent(this.getApplicationContext());

        // get usecase object
        useCase = new UseCase1();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        DataInjector.releaseComponent();
    }

    public void onAdd(View view) {

        Toast.makeText(this, "" + useCase.add(), Toast.LENGTH_SHORT).show();
    }

    public void onSubtract(View view) {

        Toast.makeText(this, "" + useCase.subtract(), Toast.LENGTH_SHORT).show();
    }

    public void onNext(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
