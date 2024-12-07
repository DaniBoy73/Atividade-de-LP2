package com.mycompany.questao1;

import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Diga quantas horas foram trabalhadas");
        int horas = info.nextInt();
        int salario = horas*20;
        
        System.out.println("O salário é de "+salario+" reais.");
       
 }
}