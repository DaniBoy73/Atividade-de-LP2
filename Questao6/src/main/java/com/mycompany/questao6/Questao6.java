package com.mycompany.questao6;

import java.util.Scanner;
public class Questao6 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Calcule a média do aluno");
        System.out.println("------------------------");
        System.out.println("Nota1: ");
        double nota1 = info.nextDouble();
        System.out.println("Nota2: ");
        double nota2 = info.nextDouble();
        System.out.println("Trabalho: ");
        double trabalho = info.nextDouble();
        
        double media = ((nota1 + nota2 + trabalho)/3);
        
        if (media >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
