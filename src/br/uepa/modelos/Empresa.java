package br.uepa.modelos;

public class Empresa {
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Predio predio;

    public Empresa(String nomeEmpresa, String cnpjEmpresa, String nomeGerente) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.predio = new Predio(nomeGerente);
    }

    public void setEndereco(String cep, String estado, String cidade, String bairro, String rua, int numero) {
        this.predio.setEndereco(cep, estado, cidade, bairro, rua, numero);
    }

    public String getEstado() {
        return this.predio.endereco.getEstado();
    }

    public void verificar() {
        System.out.println(String.format("Nome: %s, cnpj: %s, nome gerente: %s", this.nomeEmpresa, this.cnpjEmpresa, this.predio.getNomeGerente()));
    }
}
