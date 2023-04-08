import java.text.DecimalFormat;
import java.text.Format;
import java.util.HashMap;
import java.util.Map;

public class BalancoTrimestral {
   
    public static void main(String[] args) throws Exception {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        /*
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Foram gastos no primeiro trimestre: " + formatador.format(gastosTrimestre));

        double mediaPorMes = gastosTrimestre / 3;
        System.out.println("A média de gastos foi de " + formatador.format(mediaPorMes));
 
        
        Map<String, Double> gastosMensais = new HashMap<String, Double>(){{
            put("Janeiro", 15000d);
            put("Fevereiro", 23000d);
            put("Março", 17000d);
        }};

        Double sum = gastosMensais.values().stream().reduce(0d, Double::sum);

        System.out.println("Foram gastos no primeiro trimestre " + formatador.format(sum));
        System.out.println("A média de gastos no primeiro trimestre foi de " + formatador.format(sum/3));
        */

        for(int i = 150; i<=300; i++) {
            System.out.println(i);
        }

     

    }
}
