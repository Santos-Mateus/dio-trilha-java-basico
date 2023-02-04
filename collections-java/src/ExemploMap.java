import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;

public class ExemploMap {
    public static void main(String args[]) {
      System.out.println("Crie um dicionário que relacione os modelos dos carros");
    
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
    
      System.out.println(carrosPopulares.toString());
      
      System.out.println("Subtitução de consumo do Gol");
      carrosPopulares.put("Gol", 15.2);
      
      System.out.println(carrosPopulares.toString());
      
      System.out.println("Tucson está na coleção? - " + carrosPopulares.containsKey("Tucson"));
      System.out.println("Kwid está na coleção? - " + carrosPopulares.containsKey("Kwid"));
      
      System.out.println("Consumo do Uno: R.: " + carrosPopulares.get("Uno"));
      
      
      Set<String> modelos = carrosPopulares.keySet();
      System.out.println("Os modelos são: " + modelos);
      
      Collection<Double> consumo = carrosPopulares.values();
      System.out.println("Os consumos dos carros são: " + consumo);
      
      Double modeloMaisEficiente = Collections.max(carrosPopulares.values());
      Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
      System.out.println("O modelo mais econômico é: " + entries);
      
      
      /*System.out.println(carrosPopulares.toString());*/
   
   
    }
}