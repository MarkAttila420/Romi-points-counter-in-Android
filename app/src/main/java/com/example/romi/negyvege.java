package com.example.romi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class negyvege extends AppCompatActivity {

    private String p1nev;
    private int p1pont;
    private String p2nev;
    private int p2pont;
    private String p3nev;
    private int p3pont;
    private String p4nev;
    private int p4pont;

    private TextView elsoHely;
    private TextView masodikHely;
    private TextView harmadikHely;
    private TextView negyedikHely;
    private Button uj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negyvege);

        p1nev= getIntent().getExtras().getString("p1nev");
        p2nev= getIntent().getExtras().getString("p2nev");
        p3nev= getIntent().getExtras().getString("p3nev");
        p4nev= getIntent().getExtras().getString("p4nev");
        p1pont= getIntent().getExtras().getInt("p1pont");
        p2pont= getIntent().getExtras().getInt("p2pont");
        p3pont= getIntent().getExtras().getInt("p3pont");
        p4pont= getIntent().getExtras().getInt("p4pont");

        elsoHely=(TextView) findViewById(R.id.negyvege1);
        masodikHely=(TextView) findViewById(R.id.negyvege2);
        harmadikHely=(TextView) findViewById(R.id.negyvege3);
        negyedikHely=(TextView) findViewById(R.id.negyvege4);
        uj=(Button)findViewById(R.id.negyuj);

        Jatekos[] jatekosok={new Jatekos(p1nev,p1pont),new Jatekos(p2nev,p2pont),new Jatekos(p3nev,p3pont),new Jatekos(p4nev,p4pont)};
        Arrays.sort(jatekosok,new SortJatekos());

        elsoHely.setText("Első hely: "+jatekosok[0].getName()+", "+String.valueOf(jatekosok[0].getPont())+" pontal");
        masodikHely.setText("Második hely: "+jatekosok[1].getName()+", "+String.valueOf(jatekosok[1].getPont())+" pontal");
        harmadikHely.setText("Harmadik hely: "+jatekosok[2].getName()+", "+String.valueOf(jatekosok[2].getPont())+" pontal");
        negyedikHely.setText("Negyedik hely: "+jatekosok[3].getName()+", "+String.valueOf(jatekosok[3].getPont())+" pontal");

        uj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuj();
            }
        });
    }
    public void openuj(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}