package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    // Método para pedir o valor do Imóvel
    public double pedirValorImovel() {
        while (true) {
            System.out.println("Digite o valor do imóvel desejado:");
            double valor = scanner.nextDouble();
            if (valor <= 0 || valor > 99999999) {
                System.out.println("Valor inválido!!! Informe um valor válido.");
            } else {
                return valor;
            }
        }

    }

    // Método para pedir o prazo do financiamento
    public int pedirPrazoFinanciamento() {
        while (true) {
            System.out.println("Digite o prazo do financiamento desejado (em anos):");
            int prazo = scanner.nextInt();
            if (prazo <= 0 || prazo >= 99) {
                System.out.println("Prazo inválido!!! Informe um prazo válido.");
            } else {
                return prazo;
            }
        }

    }

    // Método para pedir a taxa de juros anual
    public double pedirTaxaJuros() {
        while (true) {
            System.out.println("Digite a taxa de juros:");
            double taxa = scanner.nextDouble();
            if (taxa <= 0 || taxa > 50) {
                System.out.println("Taxa Inválida!!! Informe uma taxa válida.");
            } else {
                return taxa;
            }
        }

    }



    // Método para fechar o scanner quando não for mais necessário
    public void fecharScanner() {
        scanner.close();
    }
}
