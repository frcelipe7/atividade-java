package br.uepa.modelos;

public class Revendedora {

    private Endereco enderecoRevendedora;
    private Estoque estoqueRevendedora;


    public Revendedora(Endereco enderecoRevendedora, Estoque estoqueRevendedora) {
        this.enderecoRevendedora = enderecoRevendedora;
        this.estoqueRevendedora = estoqueRevendedora;
    }

    public Endereco getEnderecoRevendedora() {
        return enderecoRevendedora;
    }

    public void setEnderecoRevendedora(Endereco endereco) {
        this.enderecoRevendedora = endereco;
    }

    public void realizarVenda(){
        System.out.println("realizando venda...");
    }

}
