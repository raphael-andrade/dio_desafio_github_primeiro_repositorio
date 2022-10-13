import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero.
  Em uma etapa, se o número atual for par, você deve dividi-lo por 2, caso contrário,
   você deve subtrair 1 dele.
   Entrada
   A entrada consiste em um número inteiro x.
   Você deverá implementar a solução de acordo com a descrição do desafio.
   Saída
   O resultado impresso, será o valor exato das etapas possíveis para reduzir o valor de x a zero.
    */
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    var step = 0;

    while ( num > 0){
        if ( num %2 == 0){
            num /= 2;
            step ++;
        }else {
            num = num -1;
            step++;
        }
    }
    System.out.println(step);

    }
}