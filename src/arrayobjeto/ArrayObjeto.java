package arrayobjeto;

import java.util.Scanner;

public class ArrayObjeto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayCarros vet = new ArrayCarros(2);

        
        for (int i = 0; i < 2; i++) {
            Carros carro;

            System.out.println("Digite o nome do carro:");
            String nome = scan.nextLine();

            System.out.println("Digite o ano:");
            int ano = scan.nextInt();

            scan.nextLine();
            System.out.println("Digite o preco do carro:");
            float preco = scan.nextFloat();
            scan.nextLine();
            System.out.println("--------------------------------------------\n");

            carro = new Carros(nome, ano, preco);

            vet.adicionarCarros(carro);

        }

        System.out.println("----------------IMPRESSAO DOS DADOS---------------\n");

        System.out.println(vet.mostrarCarros());
    }

}
