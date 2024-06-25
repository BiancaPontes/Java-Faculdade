package modelo;

public abstract class Financiamento {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaDeJuros;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaDeJuros) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaDeJuros = taxaDeJuros;
    }

    public Financiamento(double valorImovel) {
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    /** public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }**/

    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaDeJuros / 12));
    }

    public double calcularTotalPagamento() {
        return (this.calcularPagamentoMensal() * this.prazoFinanciamento * 12);
    }

    public void exibirDadosFinanciamento() {
        System.out.println("Valor do Imóvel: " + this.valorImovel);
        System.out.println("Prazo de Financiamento: " + this.prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + this.taxaDeJuros + "%");
        System.out.println("Pagamento Mensal: " + this.calcularPagamentoMensal());
        System.out.println("Total do Pagamento: " + this.calcularTotalPagamento());

    }

    public double getValorImovel() {
        return valorImovel;
    }


}

