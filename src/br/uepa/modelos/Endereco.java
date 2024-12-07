package br.uepa.modelos;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    Endereco(String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    // setters
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // getters
    public String getCep() {
        return this.cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
}
