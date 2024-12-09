package br.uepa.modelos;

public class Revendedora extends Predio {

    public Revendedora(String nomeGerente, Empresa empresa) {
        super(nomeGerente, empresa);
    }

    public void abastecerEstoque(int qtdProdutosAbastecimento) {
        this.entradaEstoque(qtdProdutosAbastecimento);
    }

    public void venderProduto(int qtdProdutosVenda){
        this.saidaEstoque(qtdProdutosVenda, "Quantidade no estoque é insuficiente", "Venda realizada com sucesso");
    }

    public void realizarVenda(int qtdProdutos) {

    }
}
