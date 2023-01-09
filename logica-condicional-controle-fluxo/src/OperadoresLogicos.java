public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
    
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = true;

    System.out.println("Primeira operação");
    if(b1 || b4){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    }

    System.out.println("\nSegunda operação");
    if(b1 && b3){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    }
    
    System.out.println("\nTerceira operação");
    if(b1 ^ b2){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    }
    
    System.out.println("\nQuarta operação");
     if(b1 != b4){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    }

    System.out.println("\nQuinta operação");
    double salarioMensal = 2500.80;
    double salarioMedio = 3800.50;

    int dependentes = 3;
    int mediaDeprendentes = 1;

    boolean salarioBaixo = salarioMensal < salarioMedio;
    boolean muitosDependentes = dependentes > mediaDeprendentes;

    boolean recebeAuxilio = salarioBaixo && muitosDependentes;
    System.out.println("Recebe auxílio? " + recebeAuxilio);
    }
}
