package br.uepa.modelos;

public class Predio {
    protected Endereco endereco;
    private String nomeGerente;
    private Empresa empresa;
    private Estoque estoque;

    public Predio(String nomeGerente, Empresa empresa) {
        this.nomeGerente = nomeGerente;
        this.empresa = empresa;
        this.estoque = new Estoque();
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

    public void saidaEstoque(int qtdSaida, String sucessoMessage, String erroMessage){
        if (this.estoque.getQtdProdutosEstoque() < qtdSaida) {
            System.out.println(erroMessage);
        } else {
            this.estoque.saidaProduto(qtdSaida);
            System.out.println(sucessoMessage);
        }
    }
}
