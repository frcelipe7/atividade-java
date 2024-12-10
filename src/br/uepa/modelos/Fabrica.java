package br.uepa.modelos;

public class Fabrica extends Predio {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";

    public Fabrica(String nomeGerente) {
        super(nomeGerente);
    }

    public void fabricarProdutos(int qtdProdutos) {
        this.entradaEstoque(qtdProdutos);
    }

    @Override
    public void saidaEstoque(int qtdSaida) {
        if (this.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println(ANSI_RED+"Quantidade no estoque é insuficiente. Iniciando fabricacao."+ANSI_RESET);
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println(ANSI_GREEN+"Registrando saida. Enviando produtos para a revendedora!"+ANSI_RESET);
        }
    }
}
