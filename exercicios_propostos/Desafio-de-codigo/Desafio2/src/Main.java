import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
 /* Neste problema, deve-se ler
    O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1.
    O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
    Após, calcule e mostre o valor a ser pago.*/

        Scanner scan = new Scanner(System.in);
        double valorPagar = 0;
         for (int i = 0; i < 2 ; i++){
             System.out.println("Codigo do produto " + (i +1) + " :");
             int codigo = scan.nextInt();
             System.out.println("Numero de peças do produto " + (i +1) + " :");
             int quantidade = scan.nextInt();
             System.out.println("Valor unitário do produto " + (i +1) + " :");
             double preco = scan.nextDouble();
             valorPagar += quantidade * preco;
        }
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorPagar));
    }
}