package br.uepa.modelos;

public class Empresa {
    private String nomeEmpresa;
    private String cnpjEmpresa;

    public Empresa(String nomeEmpresa, String cnpjEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
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
