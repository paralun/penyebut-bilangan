/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class Penyebut {

    String[] angka = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh",
        "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    private String sebut(int x) {
        String bilang = "";
        int y = x / 100;
        if (y > 0) {
            bilang = angka[y] + " Ratus ";
            if (y == 1) {
                bilang = "Seratus ";
            }
            x %= 100;
        }
        if (x < 12) {
            bilang += angka[x];
        } else {
            y = x / 10;
            x %= 10;
            if (y == 1) {
                bilang += angka[x] + " Belas";
            } else {
                bilang += angka[y] + " Puluh " + angka[x];
            }
        }
        return bilang;
    }

    public String terbilang(long x) {
        int y;
        String bilang = "";
        String[] satuan = {"", " Ribu ", " Juta ", " Milyar ", " Trilyun ", " Quadrilyun ", " Quintilyun "};
        if (x > Math.pow(10, 20)) {
            return "Bilangan terlalu besar";
        }
        for (int i = 6; i > 0; i--) {
            y = (int) (x / Math.pow(10, i * 3));
            if (y > 0) {
                if (y == 1 && i == 1) {
                    bilang += " Seribu ";
                } else {
                    bilang += sebut(y) + satuan[i];
                }
            }
            x %= Math.pow(10, i * 3);
        }
        bilang += sebut((int) x);
        return bilang;
    }
}
