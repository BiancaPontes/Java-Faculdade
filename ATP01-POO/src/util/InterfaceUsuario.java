package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private final Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double valorImovelUsu() {
        double valorIm;
        while (true) {
            System.out.print("Digite o valor do imóvel: ");
            valorIm = this.scanner.nextDouble();
            if (valorIm >= 100000.00  && valorIm <= 700000000) {
                break;
            } else {
                System.out.println("Valor fora da faixa inicial de financiamento (valor inicial: 10.0000,00), digite outro valor");
            }
        }
        return valorIm;
    }

    public int prazoFinanciamentoUsu() {
        int financia;
        while (true) {
            System.out.print("Digite o prazo do financiamento em anos: ");
            financia = this.scanner.nextInt();
            if (financia >= 25 && financia <= 60)  {
                break;
            } else {
                System.out.println("Quantidade de anos abaixo do valor de referência (de 25 a 60 anos), digite outro valor");
            }
        }
        return (int) financia;
    }

    public double taxaJurosUsu() {
        double juros;
        while (true) {
            System.out.print("Digite a taxa de juros em % Ex: 1,0 ");
            juros = this.scanner.nextDouble();
            if (juros >= 0 && juros <= 20) {
                break;
            } else {
                System.out.println("Taxa de juros iválida");
            }
        }
        return juros;
    }

}