package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaDeJuros) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double calcularTaxaMensal() {
        return this.taxaDeJuros / 12;
    }

    public int calcularMeses() {
        return this.prazoFinanciamento / 12;
    }

    public double calcularPagamentoMensal() {
        return this.valorImovel * calcularTaxaMensal() * Math.pow(1 + calcularTaxaMensal(), calcularMeses()) / (Math.pow(1 + calcularTaxaMensal(), calcularMeses()) - 1);
    }

    public void exibirDadosFinanciamento() {
        System.out.println("Tipo: Apartamento");
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println();
    }
}

