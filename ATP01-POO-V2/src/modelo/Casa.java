package modelo;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double areaTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaDeJuros, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
        this.areaTerreno = areaTerreno;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaDeJuros / 12) + 80);
    }

    public double areaConstruidaUsu() {
        return this.areaConstruida;
    }

    public double areaTerrenoUsu(){
        return this.areaTerreno;
    }

    public void exibirDadosFinanciamento() {
        System.out.println("Informações Imóvel");
        System.out.println("Tipo: Casa");
        System.out.println("Área Construida: " + areaConstruidaUsu());
        System.out.println("Área Terreno: " + areaTerrenoUsu());
        System.out.println();
        System.out.println("----- Valores ------ ");
        System.out.println();
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());
        System.out.println();
    }
}
