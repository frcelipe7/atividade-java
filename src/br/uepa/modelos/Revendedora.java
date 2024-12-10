package br.uepa.modelos;

public class Revendedora extends Predio {

    public Revendedora(String nomeGerente) {
        super(nomeGerente);
    }

    public void abastecerEstoque(int qtdProdutosAbastecimento) {
        this.entradaEstoque(qtdProdutosAbastecimento);
    }

    @Override
    public void saidaEstoque(int qtdSaida) {
        if (this.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println("Quantidade no estoque é insuficiente.");
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println("Venda realizada com sucesso!");
        }
    }
}
