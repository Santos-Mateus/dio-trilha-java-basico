package arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];

        for(int i = 0;i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Sucess Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        
        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
           System.out.print(numero-1 + " "); 
        }
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
           System.out.print(numero+1 + " "); 
        }

    }
}
