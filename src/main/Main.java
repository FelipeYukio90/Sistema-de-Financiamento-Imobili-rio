package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        Scanner scanner = new Scanner(System.in);

        //Criando Array list
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        boolean adicionarFin = true;

        //Coletando os dados do financiamento
        while (adicionarFin){
            System.out.println("Digite os dados do financiamento: ");
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();
            int prazoFinanciamentoEmAnos = interfaceUsuario.pedirPrazoFinanciamento();
            double valorImovel = interfaceUsuario.pedirValorImovel();
            //Criando o novo financiamento
            Financiamento financiamento = new  Financiamento(valorImovel,prazoFinanciamentoEmAnos, taxaJuros);
            financiamentos.add(financiamento);
            System.out.println("Deseja incluir um novo financiamento? (S/N): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase ("N")){
                adicionarFin = false;
                }
            }
        double totalImoveis = 0;
        double totalFinanciamento = 0;
        System.out.println("\nResumo dos financiamentos: ");
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            System.out.printf("Financiamento %d – valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f\n",
                    i + 1, financiamento.getValorImovel(), financiamento.calcularTotalPgto());
            totalImoveis +=financiamento.getValorImovel();
            totalFinanciamento +=financiamento.calcularTotalPgto();
        }
        System.out.printf("\nTotal de todos os imóveis:R$ %.2f\n", totalImoveis);
        System.out.printf("\nTotal de todos os financiamentos: R$ %.2f\n", totalFinanciamento);
    }
}

