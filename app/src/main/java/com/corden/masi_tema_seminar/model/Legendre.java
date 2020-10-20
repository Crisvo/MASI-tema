package com.corden.masi_tema_seminar.model;

import java.lang.Math;

public class Legendre {
    int a;
    int p;

    public Legendre(int a, int p) {
        this.a = a;
        this.p = p;
    }

    private boolean checkConditions() {
        if (p % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(p); i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }

    public Integer calculateLegendreSymbol() {
        if (!checkConditions())
            return null;
        int condition = a % p;
        if (condition == 0) {
            return 0;
        }
        // verificam daca a este rest patratic %p
        return (int)(Math.pow(a, (p - 1) / 2) % p);
    }

    public int getA() {
        return a;
    }

    public int getP() {
        return p;
    }
}
