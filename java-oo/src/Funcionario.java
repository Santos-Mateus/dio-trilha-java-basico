public class Funcionario {
    double salario;

    public double bonificacao(double percentual){
        return salario + (salario*(percentual/100));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
