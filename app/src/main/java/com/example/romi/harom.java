package com.example.romi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class harom extends AppCompatActivity {

    private Button next;
    private EditText p1;
    private EditText p2;
    private EditText p3;

    private int maxPont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harom);

        maxPont= getIntent().getExtras().getInt("maxPont");
        next=(Button) findViewById(R.id.haromkezdes);
        p1=(EditText) findViewById(R.id.harom1nev);
        p2=(EditText) findViewById(R.id.harom2nev);
        p3=(EditText) findViewById(R.id.harom3nev);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHaromjatek();
            }
        });
    }
    public void openHaromjatek(){
        Intent intent=new Intent(this,haromjatek.class);
        intent.putExtra("p1nev",p1.getText().toString());
        intent.putExtra("p2nev",p2.getText().toString());
        intent.putExtra("p3nev",p3.getText().toString());
        intent.putExtra("p1pont",0);
        intent.putExtra("p2pont",0);
        intent.putExtra("p3pont",0);
        intent.putExtra("maxPont",maxPont);
        intent.putExtra("korInt",1);
        intent.putExtra("osztoInt",1);
        startActivity(intent);
    }
}