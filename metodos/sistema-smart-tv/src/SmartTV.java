public class SmartTV {
    
    boolean ligaDesliga = false;
    int canal = 10;
    int volume = 5;
    
    public void ligarDesligar(int resposta) {
        if(resposta == 1){
            ligaDesliga=true;
        }else{
            ligaDesliga=false;
        }
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }   

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
}
