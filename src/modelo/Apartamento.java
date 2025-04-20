package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {

        super(valorImovel, prazoFinanciamento, taxaJurosAnual);



    }
    public double calcularPgtoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12;
        int meses = getPrazoFinanciamento() * 12;
        return (getValorImovel() * Math.pow(1 + taxaMensal, meses) * taxaMensal) /
                (Math.pow(1 + taxaMensal, meses) - 1);
    }
}
