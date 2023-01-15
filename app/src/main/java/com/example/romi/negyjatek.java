package com.example.romi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class negyjatek extends AppCompatActivity {

    private Button next;
    private EditText p1;
    private EditText p2;
    private EditText p3;
    private EditText p4;
    private Button allas;
    private TextView kor;
    private TextView oszto;
    private Switch p1switch;
    private Switch p2switch;
    private Switch p3switch;
    private Switch p4switch;
    private Switch duplaswitch;

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
    private int szepko=0;
    boolean dupla=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negyjatek);


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

        next=(Button) findViewById(R.id.negyjateknext);
        allas=(Button) findViewById(R.id.negyallas);
        p1=(EditText) findViewById(R.id.negyjatekp1);
        p2=(EditText) findViewById(R.id.negyjatekp2);
        p3=(EditText) findViewById(R.id.negyjatekp3);
        p4=(EditText) findViewById(R.id.negyjatekp4);
        kor=(TextView)findViewById(R.id.negykor);
        oszto=(TextView)findViewById(R.id.negyoszto);
        p1switch=(Switch)findViewById(R.id.negyp1s);
        p2switch=(Switch)findViewById(R.id.negyp2s);
        p3switch=(Switch)findViewById(R.id.negyp3s);
        p4switch=(Switch)findViewById(R.id.negyp4s);
        duplaswitch=(Switch)findViewById(R.id.negydupla);

        p1.setHint(p1nev+" pontja");
        p2.setHint(p2nev+" pontja");
        p3.setHint(p3nev+" pontja");
        p4.setHint(p4nev+" pontja");
        kor.setText(String.valueOf(korInt)+". kör");

        switch(osztoInt){
            case 1:
                oszto.setText("Osztó: "+p1nev);
                break;
            case 2:
                oszto.setText("Osztó: "+p2nev);
                break;
            case 3:
                oszto.setText("Osztó: "+p3nev);
                break;
            case 4:
                oszto.setText("Osztó: "+p4nev);
                break;
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kovetkezoKor();
            }
        });
        allas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allasgomb();
            }
        });
        p1switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    szepko=1;
                }
            }
        });
        p2switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    szepko=2;
                }
            }
        });
        p3switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    szepko=3;
                }
            }
        });
        p4switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    szepko=4;
                }
            }
        });
        duplaswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    dupla=true;
                }
                else{
                    dupla=false;
                }
            }
        });

    }
    public void kovetkezoKor(){

        switch(osztoInt){
            case 1:
                osztoInt++;
                oszto.setText("Osztó: "+p2nev);
                break;
            case 2:
                osztoInt++;
                oszto.setText("Osztó: "+p3nev);
                break;
            case 3:
                osztoInt++;
                oszto.setText("Osztó: "+p4nev);
                break;
            case 4:
                osztoInt=1;
                oszto.setText("Osztó: "+p1nev);
                break;
        }
        switch(szepko){
            case 1:
                if(dupla) p1pont += 200;
                else p1pont += 100;
                break;
            case 2:
                if(dupla) p2pont += 200;
                else p2pont += 100;
                break;
            case 3:
                if(dupla) p3pont += 200;
                else p3pont += 100;
                break;
            case 4:
                if(dupla) p4pont += 200;
                else p4pont += 100;
                break;
        }
        if(p1.getText().length()!=0){
            p1pont+=Integer.parseInt(p1.getText().toString());
            if(dupla) p1pont+=Integer.parseInt(p1.getText().toString());
        }
        if(p2.getText().length()!=0){
            p2pont+=Integer.parseInt(p2.getText().toString());
            if(dupla) p2pont+=Integer.parseInt(p2.getText().toString());
        }
        if(p3.getText().length()!=0){
            p3pont+=Integer.parseInt(p3.getText().toString());
            if(dupla) p3pont+=Integer.parseInt(p3.getText().toString());
        }
        if(p4.getText().length()!=0){
            p4pont+=Integer.parseInt(p4.getText().toString());
            if(dupla) p4pont+=Integer.parseInt(p4.getText().toString());
        }
        korInt++;
        kor.setText(String.valueOf(korInt)+". kör");
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p1switch.setChecked(false);
        p2switch.setChecked(false);
        p3switch.setChecked(false);
        p4switch.setChecked(false);
        duplaswitch.setChecked(false);
        if(p1pont==maxPont){
            p1pont=0;
        }
        if(p2pont==maxPont){
            p2pont=0;
        }
        if(p3pont==maxPont){
            p3pont=0;
        }
        if(p4pont==maxPont){
            p4pont=0;
        }
        if(p1pont>maxPont||p2pont>maxPont||p3pont>maxPont||p4pont>maxPont){
            Intent intent=new Intent(this,negyvege.class);
            intent.putExtra("p1nev",p1nev);
            intent.putExtra("p2nev",p2nev);
            intent.putExtra("p3nev",p3nev);
            intent.putExtra("p4nev",p4nev);
            intent.putExtra("p1pont",p1pont);
            intent.putExtra("p2pont",p2pont);
            intent.putExtra("p3pont",p3pont);
            intent.putExtra("p4pont",p4pont);
            startActivity(intent);
        }
    }

    public void allasgomb(){
        Intent intent=new Intent(this,negyallas.class);
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