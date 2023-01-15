package com.example.romi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class negyallas extends AppCompatActivity {

    private int maxPont;
    private int korInt;
    private int osztoInt;

    private String p1nev;
    private int p1pont;
    private String p2nev;
    private int p2pont;
    private String p3nev;
    private int p3pont;
    private String p4nev;
    private int p4pont;

    private TextView p1;
    private TextView p2;
    private TextView p3;
    private TextView p4;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negyallas);

        p1=(TextView)findViewById(R.id.negyallas1);
        p2=(TextView)findViewById(R.id.negyallas2);
        p3=(TextView)findViewById(R.id.negyallas3);
        p4=(TextView)findViewById(R.id.negyallas4);
        back=(Button)findViewById(R.id.back2);

        maxPont= getIntent().getExtras().getInt("maxPont");
        korInt= getIntent().getExtras().getInt("korInt");
        osztoInt= getIntent().getExtras().getInt("osztoInt");
        p1nev= getIntent().getExtras().getString("p1nev");
        p2nev= getIntent().getExtras().getString("p2nev");
        p3nev= getIntent().getExtras().getString("p3nev");
        p4nev= getIntent().getExtras().getString("p4nev");
        p1pont= getIntent().getExtras().getInt("p1pont");
        p2pont= getIntent().getExtras().getInt("p2pont");
        p3pont= getIntent().getExtras().getInt("p3pont");
        p4pont= getIntent().getExtras().getInt("p4pont");


        p1.setText(p1nev+" pontja: "+String.valueOf(p1pont));
        p2.setText(p2nev+" pontja: "+String.valueOf(p2pont));
        p3.setText(p3nev+" pontja: "+String.valueOf(p3pont));
        p4.setText(p4nev+" pontja: "+String.valueOf(p4pont));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vissza();
            }
        });
    }
    public void vissza(){
        Intent intent=new Intent(this,negyjatek.class);
        intent.putExtra("p1nev",p1nev);
        intent.putExtra("p2nev",p2nev);
        intent.putExtra("p3nev",p3nev);
        intent.putExtra("p4nev",p4nev);
        intent.putExtra("p1pont",p1pont);
        intent.putExtra("p2pont",p2pont);
        intent.putExtra("p3pont",p3pont);
        intent.putExtra("p4pont",p4pont);
        intent.putExtra("maxPont",maxPont);
        intent.putExtra("korInt",korInt);
        intent.putExtra("osztoInt",osztoInt);
        startActivity(intent);
    }
}