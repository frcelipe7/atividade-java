package br.uepa.modelos;

public class Empresa {
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Predio predio;

    public Empresa(String nomeEmpresa, String cnpjEmpresa, Predio predio) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.predio = predio;
        predio.setEmpresa(this);
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return this.cnpjEmpresa;
    }
}
