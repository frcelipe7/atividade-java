package br.uepa.modelos;

public class Estoque {

    private String nomeEstoque;
    private String descricaoEstoque;
    private double pesoEstoque;
    private Produto produtoEstoque;

    public void setNome(String nome) {
        this.nomeEstoque = nomeEstoque;
    }

    public void setDescricao(String descricao) {
        this.descricaoEstoque = descricaoEstoque;
    }

    public void setPesoEstoque(double pesoEstoque) {
        this.pesoEstoque = pesoEstoque;
    }

    public String getNome() {
        return nomeEstoque;
    }

    public String getDescricao() {
        return descricaoEstoque;
    }

    public double getPesoEstoque() {
        return pesoEstoque;
    }

    public void preencherEstoque(){
        System.out.println("Preenchendo estoque...");
    }
}
