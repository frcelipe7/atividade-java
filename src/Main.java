import br.uepa.modelos.Empresa;
import br.uepa.modelos.Revendedora;

public class Main {
    public static void main(String[] args) {
        // criando uma empresa e um predio de revenda da empresa
        Empresa minhaEmpresa = new Empresa("Vale", "1234");
        Revendedora minhaRevendedora = new Revendedora("Silvio Santos", minhaEmpresa);

        minhaRevendedora.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);

        System.out.println("nome empresa: " + minhaRevendedora.getNomeGerente());
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // adicionando produtos no estoque
        minhaRevendedora.abastecerEstoque(100);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // venda realizada com sucesso
        minhaRevendedora.realizarVenda(80);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // quantidade no estoque é insuficiente
        minhaRevendedora.realizarVenda(80);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

    }
}
