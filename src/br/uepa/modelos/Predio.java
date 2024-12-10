package br.uepa.modelos;

public class Predio {
    protected Endereco endereco;
    private String nomeGerente;
    protected Estoque estoque;
    private Empresa empresa;

    public Predio(String nomeGerente) {
        this.nomeGerente = nomeGerente;
        //this.empresa = empresa;
        this.estoque = new Estoque();
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEndereco(String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.endereco = new Endereco(cep, estado, cidade, bairro, rua, numero);
    }

    // set get nomeGerente
    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public String getNomeGerente() {
        return this.nomeGerente;
    }

    // metodos do estoque
    public int getQtdProdutosEstoque() {
        return this.estoque.getQtdProdutosEstoque();
    }

    public void entradaEstoque(int qtd) {
        this.estoque.entradaProduto(qtd);
    }

    public void saidaEstoque(int qtdSaida){
        if (this.estoque.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println("Default");
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println("Default");
        }
    }
}
