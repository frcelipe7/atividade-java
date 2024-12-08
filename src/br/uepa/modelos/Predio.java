package br.uepa.modelos;

public class Predio {
    protected Endereco endereco;
    private String nomeGerente;

    public Predio(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public void setEndereco(String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.endereco = new Endereco(cep, estado, cidade, bairro, rua, numero);
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }
}
