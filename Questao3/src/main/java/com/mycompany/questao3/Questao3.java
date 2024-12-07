package com.mycompany.questao3;

import java.util.Scanner;
public class Questao3 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = info.nextInt();
        
        if(idade < 18){
            System.out.println("Você não pode tirar carteira de motorista.");
        }
        else{
            System.out.println("Você pode tirar carteira de motorista.");
        }
    }
}
