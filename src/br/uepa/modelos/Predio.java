package br.uepa.modelos;

public class Predio {
    private String gerentePredio;
    private Endereco enderecoPredio;

    // construtor
    Predio(String gerentePredio, String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.gerentePredio = gerentePredio;
    }

    // setters
    public void setGerentePredio(String gerentePredio) {
        this.gerentePredio = gerentePredio;
    }

    // getters
    public String getGerentePredio() {
        return gerentePredio;
    }

    // demais métodos
    public void setEnderecoPredio(Endereco enderecoPredio) {
        this.enderecoPredio = enderecoPredio;
    }

    public Endereco getEnderecoPredio() {
        return enderecoPredio;
    }
}
