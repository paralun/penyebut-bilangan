/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan yang akan disebut: ");
        System.out.println(new Penyebut().terbilang(sc.nextLong()));
    }
    
}
