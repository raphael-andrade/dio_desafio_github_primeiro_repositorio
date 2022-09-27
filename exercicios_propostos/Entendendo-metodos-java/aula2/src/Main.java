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

        Calculadora areaQuadrado = new Calculadora(largura);
        Calculadora areaRetangulo = new Calculadora(largura,comprimento);
        Calculadora areaTrapezio = new Calculadora(largura,comprimento,altura);

    }
}