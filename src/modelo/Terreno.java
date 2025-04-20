package modelo;

public class Terreno extends Financiamento {

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {

        super(valorImovel, prazoFinanciamento, taxaJurosAnual);

    }
    public double calcularPgtoMensal() {
        double parcelaBase = super.calcularPgtoMensal();
        return parcelaBase * 1.02; // 2% de acréscimo
    }
}
