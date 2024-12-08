package br.uepa.modelos;

public class Revendedora extends Empresa {
    private Estoque estoque;

    public Revendedora(String nomeEmpresa, String cnpjEmpresa, String nomeGerente) {
        super(nomeEmpresa, cnpjEmpresa, nomeGerente);
        this.estoque = new Estoque();
    }

    public void realizarVenda(int qtdProdutosVenda){
        if (this.estoque.getQtdProdutosEstoque() < qtdProdutosVenda) {
            System.out.println("Quantidade no estoque é insuficiente");
        } else {
            this.estoque.saidaProduto(qtdProdutosVenda);
            System.out.println("Venda realizada com sucesso");
        }
    }

    public void abastecerEstoque(int qtdProdutosAbastecimento) {
        this.estoque.entradaProduto(qtdProdutosAbastecimento);
    }

    public int getEstoque() {
        return this.estoque.getQtdProdutosEstoque();
    }
}
