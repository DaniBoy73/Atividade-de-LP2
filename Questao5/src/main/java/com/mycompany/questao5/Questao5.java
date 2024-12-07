package com.mycompany.questao5;

import java.util.Scanner;
public class Questao5 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.println("Digite um número: ");
        double num1 = info.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = info.nextDouble();
        
        if(num1 > num2){
            System.out.println(" "+num1+" é maior que "+num2+" ");
                
        }
        else if (num2 > num1) {
            System.out.println(" "+num2+" é maior que "+num1+"  ");
        }
        else{
            System.out.println("Os dois números são iguais ");
        }
    }
}
