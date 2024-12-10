package br.uepa.modelos;

public class Revendedora extends Predio {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";

    public Revendedora(String nomeGerente) {
        super(nomeGerente);
    }

    public void abastecerEstoque(int qtdProdutosAbastecimento) {
        this.entradaEstoque(qtdProdutosAbastecimento);
    }

    @Override
    public void saidaEstoque(int qtdSaida) {
        if (this.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println(ANSI_RED+"Venda nao realizada. Quantidade no estoque é insuficiente."+ANSI_RESET);
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println(ANSI_GREEN+"Venda realizada com sucesso!"+ANSI_RESET);
        }
    }
}
