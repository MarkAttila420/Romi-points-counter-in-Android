package com.example.romi;

public class Jatekos {
    int pont;
    String name;

    Jatekos(String nev){
        this.name=nev;
        this.pont=0;
    }
    Jatekos(String nev, int p){
        pont=p;
        name=nev;
    }

    int getPont(){
        return pont;
    }
    String getName(){
        return name;
    }
    void addPont(int mennyi){
        pont+=mennyi;
    }

}
