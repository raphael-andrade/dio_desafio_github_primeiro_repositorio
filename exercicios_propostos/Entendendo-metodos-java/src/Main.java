import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        double hora = calendario.get(Calendar.HOUR_OF_DAY);
        Scanner sc = new Scanner(System.in);
        double valor1;
        double valor2;

        if(hora > 5 && hora < 12){
            System.out.println("Bom dia");
        }
        else if (hora > 12 && hora < 18){
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
        System.out.println("Digite primeiro valor ");
        valor1 = sc.nextInt();
        System.out.println("Digite segundo valor");
        valor2 = sc.nextInt();
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtação = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);

        System.out.println("Emprestimo");
        System.out.println("Valor do emprestimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        System.out.println("Taxa de juros");
        double juros = sc.nextDouble()/100;

        double valorFinal = valorEmprestimo;
        for (int i=0; i<=numeroParcelas; i++){
        valorFinal+= valorEmprestimo * juros;
         }
        System.out.printf("Valor final R$" + "%.2f",valorFinal);
    }

    }
