package modelo;

public class Casa extends Financiamento {

    public Casa(double valorImovel, int prazoFinanciamento, double taxaDeJuros) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
    }
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() + 80;
    }

    public void exibirDadosFinanciamento() {
        System.out.println("Tipo: Casa");
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println();
    }
}
