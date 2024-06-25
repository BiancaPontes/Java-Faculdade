package modelo;

public class Terreno extends Financiamento {

    private String tipoDeArea;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaDeJuros, String tipoDeArea) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaDeJuros = taxaDeJuros;
        this.tipoDeArea = tipoDeArea;
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() * 1.02;
    }

    public String getTipoDeArea() {
        return tipoDeArea;
    }


    public void exibirDadosFinanciamento() {
        System.out.println("Informações Imóvel");
        System.out.println("Tipo: Terreno");
        System.out.println("Tipo de área: " + getTipoDeArea());
        System.out.println();
        System.out.println("----- Valores ------ ");
        System.out.println();
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println();
        System.out.println("_______________________");
        System.out.println();
    }
}
