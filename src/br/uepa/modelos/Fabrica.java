package br.uepa.modelos;

public class Fabrica extends Predio {
    public Fabrica(String nomeGerente) {
        super(nomeGerente);
    }

    public void fabricarProdutos(int qtdProdutos) {
        this.entradaEstoque(qtdProdutos);
    }

    @Override
    public void saidaEstoque(int qtdSaida) {
        if (this.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println("Quantidade no estoque é insuficiente. Iniciando fabricacao.");
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println("Registrando saida. Enviando produtos para a revendedora!");
        }
    }
}
