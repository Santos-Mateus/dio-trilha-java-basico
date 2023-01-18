import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
        public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("#0.00");
    
        
        System.out.println("Crie uma lista e adicione sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.3);
        notas.add(5.7);
        notas.add(9.6);
        notas.add(3.2);
        notas.add(4.2);
        notas.add(7.5);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: ");
        System.out.println(notas.indexOf(5.7));
        
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.7 pela nota 6.2: ");
        notas.set(notas.indexOf(5.7), 6.2);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.7 está na lista: ");
        System.out.println(notas.contains(6.2));
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba o menor valor da lista:  " + Collections.min(notas));

        System.out.println("Exiba o maior valor da lista:  " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores da lista:  " + formatador.format(soma));



        
        

    }
}
