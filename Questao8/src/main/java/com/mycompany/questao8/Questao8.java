package com.mycompany.questao8;

import java.util.Scanner;
public class Questao8 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.println("Informe o raio da circunferência: ");
        double raio = info.nextDouble();
        
        double area = 3.14*(raio*raio);
        
        System.out.println("A área da circunferência é "+area+"");
    }
}