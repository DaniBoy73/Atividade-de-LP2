package com.mycompany.questao7;

import java.util.Scanner;
public class Questao7 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        double altura = info.nextDouble();
        System.out.println("Informe o seu peso: ");
        double peso = info.nextDouble();
        
        double imc = (peso/(altura*2)); 
        
        if(imc > 30){
            System.out.println("Você está obeso");
        }
        else{
            System.out.println("Você não está obeso");
        }
    }
}
