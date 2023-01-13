package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tabuada de número: ");
        int tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }

        scan.close();
    }
}
