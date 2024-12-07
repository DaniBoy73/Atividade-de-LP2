package com.mycompany.questao2;

import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Diga qual a distância percorrida: ");
        int distancia = info.nextInt();
        System.out.println("Diga quanto custa o litro da gasolina: ");
        double precoGas = info.nextDouble();
        
        double consumo = distancia/12;
        double custo = consumo*precoGas;
        
        System.out.println("Na distância de "+distancia+" km, será necessário "+consumo+" litros, no valor de "+custo+" reais ");
        
    }
}
