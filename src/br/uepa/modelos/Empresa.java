package br.uepa.modelos;

public class Empresa {
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Predio predioEmpresa;

    // construtor
    Empresa(String nomeEmpresa, String cnpjEmpresa, String gerentePredio, String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.predioEmpresa = new Predio(gerentePredio, cep, estado, cidade, bairro, rua, numero);
    }

    // setters
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public void setPredioEmpresa(Predio predioEmpresa) {
        this.predioEmpresa = predioEmpresa;
    }

    // getters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public Predio getPredioEmpresa() {
        return predioEmpresa;
    }

    // demais métodos
    public void exibirDetalhesEmpresa() {
        System.out.println("Detalhes da Empresa");
        System.out.println("Nome: " + nomeEmpresa);
        System.out.println("CNPJ: " + cnpjEmpresa);
        System.out.println("Gerente: " + predioEmpresa.getGerentePredio());
    }
}
