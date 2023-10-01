
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        boolean continua = true;

        System.out.println("Contador de números");
            
        System.out.println("\nDigite o primneiro parâmetro");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        do {
            try {
                contar(primeiroParametro, segundoParametro);
                continua = false;
               
            } catch (ParametrosInvalidosException excecao) {
                System.out.println("O segundo número deve ser maior que o primeiro. Execute outra vez!");
                continua = false;
                                
            }           
            /*finally {
                System.out.println("Execução finalizada");
            }*/
        } while (continua);
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = segundoParametro - primeiroParametro;
            for(int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

        
    }
}

