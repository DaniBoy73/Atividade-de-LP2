package com.mycompany.questao9;

import java.util.Scanner;
public class Questao9 {

    public static void main(String[] args) {
        Scanner info = new Scanner (System.in);
        System.out.println("Informe as horas trabalhadas por mês: ");
        int horas = info.nextInt();
        System.out.println("Informe o valor de cada hora trabalhada: ");
        double valor = info.nextDouble();
        System.out.println("Informe o desconto percentual do INSS: ");
        int desconto = info.nextInt();
        
        double salarioBru = (horas*valor);
        double salarioLiq = salarioBru - ((desconto/100)*salarioBru);
        
        System.out.println("O valor do salário líquido é de "+salarioLiq+" reais");
    }
}
