package br.uepa.modelos;

public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private double pesoProduto;
    private double precoProduto;
    private Dimensoes dimensoesProduto;

    Produto(String nomeProduto, String descricaoProduto, double pesoProduto, double precoProduto, double alturaProduto, double larguraProduto, double profundidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.pesoProduto = pesoProduto;
        this.precoProduto = precoProduto;
        this.dimensoesProduto = new Dimensoes(alturaProduto, larguraProduto, profundidadeProduto);
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

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setDimensoesProduto(Dimensoes dimensoesProduto) {
        this.dimensoesProduto = dimensoesProduto;
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

    public double getPrecoProduto() {
        return precoProduto;
    }

    public Dimensoes getDimensoesProduto() {
        return dimensoesProduto;
    }
}
