import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o valor da largura: ");
        double largura = scan.nextDouble();
        System.out.println("Digite o valor da comprimento: ");
        double comprimento = scan.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = scan.nextDouble();
        Calculadora.calculadora(largura);
        Calculadora.calculadora(largura,comprimento);
        Calculadora.calculadora(largura,comprimento,altura);

    }
}