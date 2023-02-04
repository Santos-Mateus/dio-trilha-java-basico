import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Cria um conjunto e adiciona notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.5,5d, 3.2, 6.3));

        System.out.println(notas.toString());

        /*System.out.println("Exibição da nota 5.0: " + notas);*/
        
        System.out.println("Contem a nota 5.0: " + notas.contains(5.0));

        System.out.println("Menor e maior nota respectivamente: " + Collections.min(notas) + " / " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores do conjunto é: " + soma);

        System.out.println("A média do conjunto é: " + (soma/notas.size()));

        notas.remove(Collections.min(notas));
        System.out.println("Remove a menor nota: " + notas);

        Iterator<Double> iteratorRemove = notas.iterator();
        while(iteratorRemove.hasNext()) {
            Double next = iteratorRemove.next();
            if (next < 7) iteratorRemove.remove();
        }
        System.out.println("Notas menores que 7 excluídas: " + notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d); 
        notas2.add(8.5);
        notas2.add(9.5);
        notas2.add(5d);
        notas2.add(3.2);
        notas2.add(6.3);
        System.out.println("Notas2: " + notas2.toString());





    }
}
