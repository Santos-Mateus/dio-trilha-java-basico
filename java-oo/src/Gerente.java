public class Gerente extends Funcionario{
    public double bonificacao(double percentual){
     return salario + (salario*(percentual/100));
    }

}
