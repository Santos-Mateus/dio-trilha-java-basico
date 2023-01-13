package loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Fatorial de ");
        int fatorial = scan.nextInt();
        int count = 1;

        for(int i = fatorial; i >= 1; i--){
             count = count * i;
        }
        
        System.out.println(count);
        scan.close();
    }
}
