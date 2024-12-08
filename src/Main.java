import br.uepa.modelos.Revendedora;

public class Main {
    public static void main(String[] args) {
        Revendedora minhaRevendedora = new Revendedora("Vale", "1234", "Silvio Santos");

        minhaRevendedora.verificar();
        minhaRevendedora.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);
        System.out.println(minhaRevendedora.getEstado());

        System.out.println(minhaRevendedora.getEstoque());

        // adicionando produtos no estoque
        minhaRevendedora.abastecerEstoque(100);
        System.out.println(minhaRevendedora.getEstoque());

        // venda realizada com sucesso
        minhaRevendedora.realizarVenda(80);
        System.out.println(minhaRevendedora.getEstoque());

        // quantidade no estoque é insuficiente
        minhaRevendedora.realizarVenda(80);
        System.out.println(minhaRevendedora.getEstoque());

    }
}
