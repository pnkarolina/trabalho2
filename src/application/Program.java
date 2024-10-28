package application;

import entity.Calculadora;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador;

        do {
            System.out.println("Digite um operador (+, -, *, /) ou '.' para sair:");
            operador = sc.next();

            if (operador.equals(".")) {
                break;
            }

            System.out.println("Digite o primeiro número:");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            int num2 = sc.nextInt();

            Calculadora calculadora = new Calculadora(num1, num2);

            try {
                switch (operador) {
                    case "+":
                        System.out.println("Resultado: " + calculadora.some(num1, num2));
                        break;
                    case "-":
                        System.out.println("Resultado: " + calculadora.subtraia(num1, num2));
                        break;
                    case "*":
                        System.out.println("Resultado: " + calculadora.multiplique(num1, num2));
                        break;
                    case "/":
                        System.out.println("Resultado: " + calculadora.divida(num1, num2));
                        break;
                    default:
                        System.out.println("Operador inválido.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (!operador.equals("."));

        System.out.println("Calculadora encerrada.");
        sc.close();
    }
}


