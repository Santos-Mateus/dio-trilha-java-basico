public class Usuario {
    
        public static void main(String[] args) {
           
           SmartTV SmartTV = new SmartTV();
        
           System.out.println("Status inicial? " + SmartTV.ligaDesliga);
           System.out.println("Canal inicial? " + SmartTV.canal);
           System.out.println("Volume inicial? " + SmartTV.volume);
           System.out.println("\n");
            
           SmartTV.ligarDesligar(1);
           SmartTV.aumentarVolume();
           SmartTV.aumentarVolume();
           SmartTV.diminuirVolume();
           SmartTV.aumentarCanal();
           SmartTV.aumentarCanal();

           System.out.println("Status atual? " + SmartTV.ligaDesliga);
           System.out.println("Canal atual? " + SmartTV.canal);
           System.out.println("Volume atual? " + SmartTV.volume);
           System.out.println("\n");
        }
    
}
