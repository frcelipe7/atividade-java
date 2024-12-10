import br.uepa.modelos.Empresa;
import br.uepa.modelos.Revendedora;

public class Main {
    public static void main(String[] args) {
        // criando uma empresa e um predio de revenda da empresa
        Revendedora minhaRevendedora = new Revendedora("Silvio Santos");
        Empresa minhaEmpresa = new Empresa("SBT", "1234", minhaRevendedora);

        minhaRevendedora.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);

        System.out.println("Nome gerente: " + minhaRevendedora.getNomeGerente());
        System.out.println("Nome empresa: " + minhaRevendedora.getEmpresa().getNomeEmpresa());
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // adicionando produtos no estoque
        minhaRevendedora.abastecerEstoque(100);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // venda realizada com sucesso
        minhaRevendedora.saidaEstoque(80);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

        // quantidade no estoque é insuficiente
        minhaRevendedora.saidaEstoque(80);
        System.out.println(minhaRevendedora.getQtdProdutosEstoque());

    }
}
