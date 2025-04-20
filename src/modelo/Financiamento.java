package modelo;

public class Financiamento {
    // Atributos Solicitados
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;


    // métodos getter
    public double getValorImovel(){
        return this.valorImovel;
    }
    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }
    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual/100;

    }
    //Método para calcular o valor do pagamento mensal
    public double calcularPgtoMensal(){
        return (this.valorImovel/(this.prazoFinanciamento*12))*(1+(this.taxaJurosAnual/12));

    }
    //Método para calcular o total do pagamento
    public double calcularTotalPgto(){
        return this.calcularPgtoMensal()*this.prazoFinanciamento*12;
    }
    public void mostrarFinanciamento() {
        System.out.printf("\nO seu Financiamento:\n");
        System.out.printf("Valor do imóvel: R$ %.2f\n", valorImovel);
        System.out.printf("Prazo do financiamento: %d anos\n", prazoFinanciamento);
        System.out.printf("Taxa de juros anual: %.2f%%\n", taxaJurosAnual * 100);
        System.out.printf("Pagamento mensal: R$ %.2f\n", calcularPgtoMensal());
        System.out.printf("Total a ser pago: R$ %.2f\n", calcularTotalPgto());
    }


}
