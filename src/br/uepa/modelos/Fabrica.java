package br.uepa.modelos;

public class Fabrica extends Predio {
    public Fabrica(String nomeGerente, Empresa empresa) {
        super(nomeGerente, empresa);
    }

    public void fabricarProdutos(int qtdProdutos) {
        this.entradaEstoque(qtdProdutos);
    }

    public void saidaProdutos(int qtdProdutos) {
        this.saidaEstoque(qtdProdutos, "Quantidade no estoque é insuficiente", "Venda realizada com sucesso");
    }
}
