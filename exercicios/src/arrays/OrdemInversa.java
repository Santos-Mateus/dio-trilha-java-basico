package arrays;

public class OrdemInversa {
    public static void main(String[] args) {
       
        int[] vetor = {-5, -6, 0, 15, 26, 54};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\n");
        for(int i = (vetor.length - 1); i >=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
