import br.uepa.modelos.Empresa;
import br.uepa.modelos.Fabrica;
import br.uepa.modelos.Revendedora;

import java.time.format.SignStyle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";

        System.out.println("\n================================================");
        System.out.println("================= Empresas.com =================");
        System.out.println("================================================");
        System.out.println("Alguns direitos reservados");
        System.out.println("v1.4.53\n");

        for (int i = 0; i < 50; i++) {
            Thread.sleep(50);
            System.out.print("█");
        }

        Thread.sleep(100);

        System.out.print(ANSI_GREEN+"\r100%                                                            "+ANSI_RESET);
        Thread.sleep(1000);
        System.out.print(ANSI_GREEN+"\rBem-vindo(a) ao melhor sistema empresarial do mundo!\n\n"+ANSI_RESET);


        Thread.sleep(2000);

        int op = 0;
        Scanner userOp = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        System.out.println("O que voce deseja fazer?\n [1] - Criar loja;\n [2] - Criar fabrica;");

        while (op != 3) {
            op = userOp.nextInt();


            Empresa minhaEmpresa;
            Revendedora minhaRevendedora;
            Fabrica minhaFabrica;


            System.out.println("Insira o nome da empresa: ");
            String nomeEmpresa = userInput.nextLine();

            System.out.println("Insira o cnpj da empresa: ");
            String cnpjEmpresa = userInput.nextLine();

            switch (op) {
                case 1:
                    /// loja/revendendora

                    // criando uma empresa e um predio de revenda da empresa
                    minhaRevendedora = new Revendedora("Default");
                    minhaEmpresa = new Empresa("Default", "Default", minhaRevendedora);

                    minhaEmpresa.setNomeEmpresa(nomeEmpresa);
                    minhaEmpresa.setCnpjEmpresa(cnpjEmpresa);

                    // endereco padrao pra economizar tempo
                    minhaRevendedora.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);

                    System.out.println("Insira o nome do gerente da loja: ");
                    String nomeGerente = userInput.nextLine();
                    minhaRevendedora.setNomeGerente(nomeGerente);

                    System.out.println("\n\nExibindo informacoes da loja ==============");


                    System.out.println("Nome gerente: " + minhaRevendedora.getNomeGerente());
                    System.out.println("Nome empresa: " + minhaRevendedora.getEmpresa().getNomeEmpresa());

                    System.out.print("\n");
                    Thread.sleep(500);

                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaRevendedora.getQtdProdutosEstoque());

                    // adicionando produtos no estoque
                    minhaRevendedora.abastecerEstoque(100);
                    System.out.println("\nAbastecendo estoque ==============");
                    System.out.println("Adicionando 100 produtos no estoque");
                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaRevendedora.getQtdProdutosEstoque());

                    System.out.print("\n");
                    Thread.sleep(500);

                    // venda realizada com sucesso
                    System.out.println("\nRealizando venda ==============");
                    System.out.println("Venda de 80 produtos");
                    minhaRevendedora.saidaEstoque(80);
                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaRevendedora.getQtdProdutosEstoque());

                    System.out.print("\n");
                    Thread.sleep(500);

                    // quantidade no estoque é insuficiente
                    System.out.println("\nRealizando venda ==============");
                    System.out.println("Venda de 80 produtos");
                    minhaRevendedora.saidaEstoque(80);
                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaRevendedora.getQtdProdutosEstoque());

                    break;
                case 2:
                    /// fabrica

                    // criando uma empresa e um predio de revenda da empresa
                    minhaFabrica = new Fabrica("Default");
                    minhaEmpresa = new Empresa("Default", "Default", minhaFabrica);

                    minhaEmpresa.setNomeEmpresa(nomeEmpresa);
                    minhaEmpresa.setCnpjEmpresa(cnpjEmpresa);

                    // endereco padrao pra economizar tempo
                    minhaFabrica.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);

                    System.out.println("\nInsira o nome do gerente da fabrica: ");
                    String nomeGerenteFabrica = userInput.nextLine();
                    minhaFabrica.setNomeGerente(nomeGerenteFabrica);

                    System.out.println("\n\nExibindo informacoes da loja ==============");

                    System.out.println(ANSI_BLUE + "Nome gerente: " + ANSI_RESET + minhaFabrica.getNomeGerente());
                    System.out.println(ANSI_BLUE + "Nome empresa: " + ANSI_RESET + minhaFabrica.getEmpresa().getNomeEmpresa());

                    System.out.print("\n");
                    Thread.sleep(500);

                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaFabrica.getQtdProdutosEstoque());

                    // fabricando e estocando produtos
                    System.out.println("\nFabricando produtos ==============");
                    System.out.println("Fabricando 100 produtos");
                    minhaFabrica.fabricarProdutos(100);
                    System.out.println(ANSI_BLUE + "Produtos fabricados e estocados: " + ANSI_RESET + minhaFabrica.getQtdProdutosEstoque());

                    System.out.print("\n");
                    Thread.sleep(500);

                    // enviando produtos para a revendedora
                    System.out.println("\nRealizando venda ==============");
                    System.out.println("Realizando venda de 80 produtos");
                    minhaFabrica.saidaEstoque(80);
                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaFabrica.getQtdProdutosEstoque());

                    System.out.print("\n");
                    Thread.sleep(500);

                    // quantidade no estoque é insuficiente
                    System.out.println("\nRealizando venda ==============");
                    System.out.println("Realizando venda de 80 produtos");
                    minhaFabrica.saidaEstoque(80);
                    System.out.println(ANSI_BLUE + "Produtos no estoque da loja: " + ANSI_RESET + minhaFabrica.getQtdProdutosEstoque());
                    break;
                case 3:
                    System.out.println(ANSI_RED+"Encerrando sistema :("+ANSI_RESET);
                    break;
            }
            System.out.print("\n");
            Thread.sleep(500);

            System.out.println("O que voce deseja fazer?\n [1] - Criar loja;\n [2] - Criar fabrica;\n [3] - Sair;");
            op = userOp.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            Thread.sleep(50);
            System.out.print("-");
        }
        System.out.println("\nGrandiosos desenvolvedores do melhor sistema para empresas do mundo: \"Empresas.com:\"");

        System.out.println(ANSI_GREEN+"Felipe Raphael Coelho dos Santos");
        Thread.sleep(200);
        System.out.println("Vinícius Mendes da Silva Correa");
        Thread.sleep(200);
        System.out.println("Rosival Soares Peres Junior");
        Thread.sleep(200);
        System.out.println("Jainer Silva Leite"+ANSI_RESET);
        Thread.sleep(200);
        for (int i = 0; i < 30; i++) {
            Thread.sleep(50);
            System.out.print("-");
        }
    }
}
