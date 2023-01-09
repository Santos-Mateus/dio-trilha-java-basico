import javax.lang.model.element.Element;

public class ControleFluxo {
    public static void main(String[] args) {
        int mes = 8;

        System.out.print("Estamos no mes de ");
        if(mes == 1){
            System.out.print("Janeiro");
        }else if(mes == 2){
            System.out.print("Fevereiro");
        }else if(mes == 3){
            System.out.print("Março");
        }else if(mes == 4){
            System.out.print("Abril");
        }else if(mes == 5){
            System.out.print("Maio");
        }else if(mes == 6){
            System.out.print("Junho");
        }else if(mes == 7){
            System.out.print("Julho");
        }else if(mes == 8){
            System.out.print("Agosto");
        }else if(mes == 9){
            System.out.print("Setembro");
        }else if(mes == 10){
            System.out.print("Outubro");
        }else if(mes == 11){
            System.out.print("Novembro");
        }else if(mes == 12){
            System.out.print("Dezembro");
        }else{
            System.out.println("Digite um valor váliso");
        }

        switch (mes) {
            case 1:
            case 7:
            case 12:
                System.out.println("\nEsse é um mês de férias.");
                break;
            default:
                System.out.println("\nIndefinido");
                break;
        }
    }

    private static void switchSemana(){
        String dia = "Quinta";
        
        switch(dia){
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia Inválido. Digite um nome correto.");
        }
    }
}