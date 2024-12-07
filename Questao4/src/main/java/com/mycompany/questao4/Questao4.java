
package com.mycompany.questao4;

import java.util.Scanner;
public class Questao4 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Informe sua temperatura: ");
        double temperatura = info.nextDouble();
        
        if(temperatura < 37){
            System.out.println("Você não está com febre.");
        }
        else{
            System.out.println("Voc6e está com febre.");
        }
    }
}
