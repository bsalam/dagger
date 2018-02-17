package com.dagger.example.bassamhamada.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private UseCase2 useCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // get usecase object
        useCase = new UseCase2();

        TextView addResult = findViewById(R.id.add);
        addResult.setText(String.valueOf(useCase.add()));

        TextView subtractResult = findViewById(R.id.subtract);
        subtractResult.setText(String.valueOf(useCase.subtract()));
    }

}
