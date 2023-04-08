import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Antonela", "Dylan", "Harry", "Mileto", "Zith"};

        double media = caculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da Turma %f", media);
    }

    public static double caculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;

    }
}
