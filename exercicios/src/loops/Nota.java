package loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero de 0 a 10");
        int nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida, digite novamente!");
            nota = scan.nextInt();
        }

    }
}
