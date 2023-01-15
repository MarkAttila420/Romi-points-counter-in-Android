package com.example.romi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b3;
    private Button b4;
    private EditText maxPont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        maxPont=(EditText) findViewById(R.id.etMaxPont);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHarom();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNegy();
            }
        });
    }

    public void openHarom(){
        Intent intent=new Intent(this,harom.class);
        if(maxPont.getText().length()!=0){
            intent.putExtra("maxPont", Integer.parseInt(maxPont.getText().toString()));
        }
        else{
            intent.putExtra("maxPont", 1000);
        }
        startActivity(intent);
    }
    public void openNegy(){
        Intent intent=new Intent(this,negy.class);
        if(maxPont.getText().length()!=0){
            intent.putExtra("maxPont", Integer.parseInt(maxPont.getText().toString()));
        }
        else{
            intent.putExtra("maxPont", 1000);
        }
        startActivity(intent);
    }
}