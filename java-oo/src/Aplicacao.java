
public class Aplicacao {
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario();

       Gerente gerente = new Gerente();
       Funcionario vendedor = new Vendedor();
       Funcionario servicosGerais = new ServicosGerais();

       gerente.setSalario(5633.55);
       gerente.bonificacao(10);

       System.out.println(gerente.getSalario() + bonificacao); 

    }
}
