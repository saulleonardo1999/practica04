package com.example.practica04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    EditText editText;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.texto);
        editText = (EditText) findViewById(R.id.edittext);
        btn1 = (Button) findViewById(R.id.boton1);
        btn2 = (Button) findViewById(R.id.boton2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.boton1:
                String dato = editText.getText().toString();
                texto.setText(dato);
                break;
            case R.id.boton2:
                texto.setText(" ");
                break;
        }
    }
}