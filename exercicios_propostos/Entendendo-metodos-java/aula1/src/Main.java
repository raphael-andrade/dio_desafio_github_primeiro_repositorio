import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor1;
        double valor2;

       Mensagem.Messagem();

        System.out.println("Digite primeiro valor ");
        valor1 = sc.nextInt();
        System.out.println("Digite segundo valor");
        valor2 = sc.nextInt();
        Calculadora.soma(valor1, valor2);
        Calculadora.subtracao(valor1, valor2);
        Calculadora.divisao(valor1, valor2);
        Calculadora.multiplicacao(valor1, valor2);

        System.out.println("Emprestimo");
        System.out.println("Valor do emprestimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        System.out.println("Taxa de juros");
        double juros = sc.nextDouble();

        Emprestimo.emprestimo(valorEmprestimo,numeroParcelas,juros);

    }
}
