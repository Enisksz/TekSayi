package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayiAl,toplam=0;
        Scanner input= new Scanner(System.in);



        do{
            System.out.println("Sayi giriniz: ");
            sayiAl = input.nextInt();
            if (sayiAl %2==0 && sayiAl %4==0){
                toplam +=sayiAl;
            }
        }while (sayiAl%2==0);
        System.out.println("2 ve 4'ün katı olanların toplamı: "+toplam);
    }
}
