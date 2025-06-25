package org.example;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converter para Fahrenheit (F) ou Celsius (C)?");
        String tipo = scanner.nextLine();

        System.out.print("Digite o valor da temperatura: ");
        double valor = scanner.nextDouble();

        if (tipo.equals("F")) {
            double resultado = (valor * 1.8) + 32;
            System.out.println(valor + " °C = " + resultado + " °F");
        } else if (tipo.equals("C")) {
            double resultado = (valor - 32) * 5.0 / 9.0;
            System.out.println(valor + " °F = " + resultado + " °C");
        } else {
            System.out.println("Opção inválida, digite apenas F ou C.");
        }

        scanner.close();
    }
}
