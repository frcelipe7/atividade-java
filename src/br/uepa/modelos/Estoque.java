package br.uepa.modelos;

public class Estoque {
    private int qtdProdutos;

    public void preencherEstoque(int qtdProdutos){
        System.out.println(String.format("Adicionando %d produtos no estoque", qtdProdutos));
        this.qtdProdutos += qtdProdutos;
    }

    public int getQtdProdutosEstoque() {
        return this.qtdProdutos;
    }

    public void saidaProduto(int qtdProdutos) {
        this.qtdProdutos -= qtdProdutos;
    }
}
