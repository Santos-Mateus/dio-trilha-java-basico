
public class Emprestimo {
    public static void emprestimo(double valor, int parcelas){
        switch(parcelas) {
            case 1:
            double caso1 = valor + (valor * 0.01); 
            System.out.println("O valor final do empréstimo com 1% de juros será de R$ " + caso1 + " dividido em " + parcelas + " parcelas.");
            break;

            case 2:
            double caso2 = valor + (valor * 0.03); 
            System.out.println("O valor final do empréstimo será de R$ " + caso2 + " dividido em " + parcelas + " parcelas.");
            break;

            case 3:
            double caso3 = valor + (valor * 0.1); 
            System.out.println("O valor final do empréstimo será de R$ " +caso3 + " dividido em " + parcelas + " parcelas.");
            break;
            
            case 4:
            double caso4 = valor + (valor * 0.15); 
            System.out.println("O valor final do empréstimo será de R$ " + caso4 + " dividido em " + parcelas + " parcelas.");
            break;

            case 5:
            double caso5 = valor + (valor * 0.26); 
            System.out.println("O valor final do empréstimo será de R$ " + caso5 + " dividido em " + parcelas + " parcelas.");
            break;

            case 6:
            double caso6 = valor + (valor * 0.33); 
            System.out.println("O valor final do empréstimo será de R$ " + caso6 + " dividido em " + parcelas + " parcelas.");
            break;
        }
    }
}
