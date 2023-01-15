package com.example.romi;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class asztal{
    ArrayList<Jatekos> jatekosok=new ArrayList<>();
    int maxPont;
    int kor;

    asztal(String a,String b,String c, int pont){
        this.kor=1;
        this.maxPont=pont;
        Jatekos temp1=new Jatekos(a);
        Jatekos temp2=new Jatekos(b);
        Jatekos temp3=new Jatekos(c);
        this.jatekosok.add(temp1);
        this.jatekosok.add(temp2);
        this.jatekosok.add(temp3);
    }
    asztal(String a,String b,String c,String d,int pont){
        kor=1;
        maxPont=pont;
        Jatekos temp1=new Jatekos(a);
        Jatekos temp2=new Jatekos(b);
        Jatekos temp3=new Jatekos(c);
        Jatekos temp4=new Jatekos(d);
        jatekosok.add(temp1);
        jatekosok.add(temp2);
        jatekosok.add(temp3);
        jatekosok.add(temp4);
    }


    public Jatekos getJatekos(int index){
        return jatekosok.get(index);
    }
    public int getMaxPont(){return maxPont;}
    public int getKor(){return kor;}
    public void ujKor(){kor++;}

}
