package com.mycompany.questao11;

import java.util.Scanner;
public class Questao11 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.println("Insira 2 números e se a soma dele for maior que 10, será somado a 5 e se for menor, será subtraido a 7");
        System.out.println("-------------------------------------");
        System.out.println("Informe o primeiro valor: ");
        double num1 = info.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double num2 = info.nextDouble();
        
        double soma = num1 + num2;
        
        if(soma >= 10 ){
            soma = soma + 5;
            System.out.println("O valor somado a 5 resultou em "+soma+" ");
       
        }
        else{
            soma = soma - 7;
            System.out.println("O valor subtraido a 7 resultou em "+soma+" ");
        }
    }
}
