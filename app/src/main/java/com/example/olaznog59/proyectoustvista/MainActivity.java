package com.example.olaznog59.proyectoustvista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void buttonEnviarNumero (View v){
    Intent intent = new Intent (this,MapsActivity.class);
    startActivity(intent);

    finish();

}

}
