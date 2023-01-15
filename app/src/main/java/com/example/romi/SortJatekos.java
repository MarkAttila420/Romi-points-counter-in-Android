package com.example.romi;

import java.util.Comparator;

public class SortJatekos implements Comparator<Jatekos> {

    @Override
    public int compare(Jatekos p1, Jatekos p2) {
        return p2.getPont()-p1.getPont();
    }
}
