package Main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario usuario = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        System.out.println("Digite os dados do financiamento");

        double valorImovel = usuario.valorImovelUsu();
        double taxaJuros = usuario.taxaJurosUsu();
        int prazoFinanciamento = usuario.prazoFinanciamentoUsu();

        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJuros));
        financiamentos.add(new Casa(900000, 55, 3.0));
        financiamentos.add(new Apartamento(valorImovel, prazoFinanciamento, taxaJuros));
        financiamentos.add(new Apartamento(500000, 35, 2.0));
        financiamentos.add(new Terreno(valorImovel, prazoFinanciamento, taxaJuros));

        for (Financiamento financiamento : financiamentos) {
            financiamento.exibirDadosFinanciamento();
            totalValorImoveis += financiamento.getValorImovel();
            totalValorFinanciamentos += financiamento.calcularTotalPagamento();
        }

        System.out.println("Total dos valores dos imóveis: " + totalValorImoveis);
        System.out.println("Total do financiamento: " + totalValorFinanciamentos);
    }
}