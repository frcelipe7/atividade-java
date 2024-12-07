package br.uepa.modelos;

public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private double pesoProduto;

    Produto(String nomeProduto, String descricaoProduto, double pesoProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.pesoProduto = pesoProduto;
    }

    // setters
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPesoProduto(double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    // getters
    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public double getPesoProduto() {
        return this.pesoProduto;
    }
}
