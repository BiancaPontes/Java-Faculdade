package modelo;

public class Terreno extends Financiamento {

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaDeJuros) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() * 1.02;
    }

    public void exibirDadosFinanciamento() {
        System.out.println("Tipo: Terreno");
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println();
    }
}
