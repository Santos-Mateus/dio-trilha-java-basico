package loops;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int contaPar = 0;
        int contaImpar = 0;

        System.out.print("Quantas números informar: ");
        int loop = scan.nextInt();

        do{
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            count++;

            if(numero % 2 == 0){
                contaPar++;
            }else{contaImpar++;} 

        }while(count < loop);

        System.out.println("O total de números informados foi " + count);
        System.out.println("O total de números pares foi " + contaPar);
        System.out.println("O total de números ímpares foi " + contaImpar);

        scan.close();
    }
}