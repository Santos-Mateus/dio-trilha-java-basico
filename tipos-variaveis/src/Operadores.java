/*
public class Operadores {
    public static void main(String[] args) {
        // Conceitos Básicos de Operações Matemáticas
        int number = 10;
        System.out.println(number);

        number = - number;
        System.out.println(number);

        number = number * -1;
        System.out.println(number);

        //booleanos
        boolean simNao = false;
        System.out.println(simNao);

        System.out.println(!simNao); //Altera apenas memória
        
        simNao = !simNao; //Altera variável
        System.out.println(simNao);

        //Ternário
        int a, b;
        a = 6;
        b = 8;

        String resultado = a == b ? "verdadeiro" : "falso";
        int resultado2 = a == b ? 1 : 0; //Não se limita a String

        System.out.println(resultado);
        System.out.println(resultado2);

        //Relacionais
        String nomeUm = "Mateus";
        String nomeDois = new String("Santos");

        System.out.println(nomeUm.equals(nomeDois));

        //Lógicos &&, ||
        
        boolean condicao1 = true;
        boolean condicao2 = false;
        

        if(condicao1  && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
*/

public class Operadores {
    public static void main(String[] args) {
        double nota = 3.65;
        String varia = nota >=6 ? "Aprovado" : nota >=4.5 && nota < 6 ? "Recuperação" : "Reprovado";
        System.out.println(varia);
    }
}