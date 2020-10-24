package com.corden.masi_tema_seminar.model;

import com.corden.masi_tema_seminar.exception.LegendreException;
import com.corden.masi_tema_seminar.helper.NumHelper;

import java.util.List;

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
        if (a >= p || a < 0) {
            a %= p;
        }
        return true;
    }

    public int calculateLegendreSymbol() throws LegendreException {
        if (!checkConditions())
            throw new LegendreException();
        switch (a) {
            case 0:
            case 1:
                return a;
            case 2:
                if (p % 8 == 1 || p % 8 == 7)
                    return 1;
                else
                    return -1;
        }
        if (a == p - 1) {
            if (p % 4 == 1) {
                return 1;
            }else
                return -1;
        }
        if(!NumHelper.isPrime(a)){
            List<Integer> factors = NumHelper.factoriseNum(a);
            int prod = 1;
            for(Integer factor : factors){
                a = factor;
                prod*=this.calculateLegendreSymbol();
            }
            return prod;
        }else{
            if (((p - 1) / 2) % 2 == 0 || ((a - 1) / 2) % 2 == 0){
                int aux = a;
                a = p;
                p = aux;
                return calculateLegendreSymbol();
            } else{
                int aux = a;
                a = p;
                p = aux;
                return (-1) * calculateLegendreSymbol();
            }
        }
    }

    public int getA() {
        return a;
    }

    public int getP() {
        return p;
    }
}
