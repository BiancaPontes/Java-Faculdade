package modelo;

public class Apartamento extends Financiamento {
    private int numeroVagas;
    private int numeroAdares;

    public Apartamento(double valorImovel, int prazoFinanciamento, int numeroAdares, int numeroVagas, double taxaDeJuros) {
        super(valorImovel, prazoFinanciamento, taxaDeJuros);
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaDeJuros = taxaDeJuros;
        this.numeroVagas = numeroVagas;
        this.numeroAdares = numeroAdares;
    }

    public double calcularTaxaMensal() {
        return this.taxaDeJuros / 12;
    }

    public int calcularMeses() {
        return this.prazoFinanciamento / 12;
    }

    public double calcularPagamentoMensal() {
        return this.valorImovel = (valorImovel * Math.pow(1 + calcularTaxaMensal(), calcularMeses())/(Math.pow(1 + calcularTaxaMensal(), calcularMeses()) - 1));
    }

    public int quantidadeVagas() {
        return this.numeroVagas;
    }

    public int quantidadeAndares() {
        return this.numeroAdares;

    }

    public void exibirDadosFinanciamento() {
        System.out.println("Tipo: Apartamento");
        System.out.println("Quantidade de vagas: " + quantidadeVagas());
        System.out.println("Quantidade de andares: " + quantidadeAndares());
        System.out.println();
        System.out.println("----- Valores ------ ");
        System.out.println();
        System.out.println("Valor do imóvel: " + getValorImovel());
        System.out.println("Pagamento mensal: " + calcularPagamentoMensal());



        System.out.println();
    }
}

