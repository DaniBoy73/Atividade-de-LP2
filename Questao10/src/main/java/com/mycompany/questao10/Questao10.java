package com.mycompany.questao10;

import java.util.Scanner;
public class Questao10 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.println("Informe o primeiro valor: ");
        double num1 = info.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double num2 = info.nextDouble();
        
        double soma = num1 + num2;
        
        if (soma >= 10){
            System.out.println("A soma é maior que 10 e tem como valor "+soma+"");
        }
        else {
            System.out.println("a soma é menor que 10");
        }
    }
}
