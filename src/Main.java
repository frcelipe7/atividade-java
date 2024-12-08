import br.uepa.modelos.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Vale", "1234", "Silvio Santos");

        minhaEmpresa.verificar();
        minhaEmpresa.setEndereco("1234-12", "Para", "Parauapebas", "da Paz", "do Arame", 203);
        System.out.println(minhaEmpresa.getEstado());
    }
}
