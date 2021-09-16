package teste;

public class Main {
    public static void main(String[] args) {




        System.out.println("teste");

        Carro carro1 = new Carro("palio", "120cv", "2009", "fiat", Origem.Alemanha);



        System.out.println(carro1.getMarca());
        System.out.println(carro1.getOrigem());
    }
}
