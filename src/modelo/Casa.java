package modelo;

public class Casa extends Financiamento {

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {

        super(valorImovel, prazoFinanciamento, taxaJurosAnual);

    }
    public double calcularPgtoMensal() {
        double parcelaBase = super.calcularPgtoMensal(); // usa cálculo padrão da superclasse
        return parcelaBase + 80; // adiciona o seguro
    }

}
