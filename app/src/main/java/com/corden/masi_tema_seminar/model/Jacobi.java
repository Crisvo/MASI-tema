package com.corden.masi_tema_seminar.model;

public class Jacobi {
    private int a;
    private int n;

    public Jacobi(int a, int n) {
        this.a = a;
        this.n = n;
    }

    private boolean checkInitialConditions(){
        return (n > a && a > 0 && n % 2 == 1);
    }

    public int calculate(){
        int t = 1;
        while (a != 0) {
            while (a % 2 == 0) {
                a /= 2;
                int r = n % 8;
                if (r == 3 || r ==5)
                    t = -t;
            }
            int aux = a;
            a = n;
            n = aux;
            if (a % 4 == 3 &&  n % 4 == 3)
                t = -t;
            a %= n;
        }
        if (n == 1)
            return t;
        else
            return 0;
    }

    public int getA() {
        return a;
    }

    public int getN() {
        return n;
    }
}
