package loops;

import java.util.Scanner;

/*
Programa que lê 5 números;
Informa o maior número digitado;
Calcula a média dos números; 
*/

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop;
        int numero;
        int count = 0;
        int maior = 0; 
        int soma = 0;
        
        System.out.print("Digite o número de repetições: ");
        loop = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            count++;
            // System.out.println("Contagem: " + count);
            soma += numero;

            if (numero > maior) maior = numero;

        }while(count < loop);
        
        System.out.println("O maior numero foi: " + maior);
        System.out.println("A média dos numeros é " + (soma / loop));

        scan.close();
    }
}
