import javax.security.sasl.AuthorizeCallback;

public class Aplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Azul", "Prisma", 38);
        Carro carro2 = new Carro("Prata", "Onix", 30);
        Carro carro3 = new Carro("Vermelho", "HB20", 28);

        double valorCombustivel = 5.79;


        double totalCarro1 = carro1.totalValorTanque(valorCombustivel);
        double totalCarro2 = carro2.totalValorTanque(valorCombustivel);
        double totalCarro3 = carro3.totalValorTanque(valorCombustivel);
        
        
        System.out.println(totalCarro1 + "\n" + totalCarro2 + "\n" + totalCarro3);


    }
}
