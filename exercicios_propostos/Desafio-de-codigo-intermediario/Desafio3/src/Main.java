import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*      Desafio
        Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos é par.
        A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.
        Entrada
        Como entrada você recerá um valor inteiro e positivo.
        Saída
        Como saída, será impresso a soma de todos os numeros inteiros positivos menores ou iguais ao num,
  */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        var quantidade = 0;

        for (int i = 1; i <= num; i++) {
            var converterString = String.valueOf(i);
            if (converterString.length() == 1) {
                if (i % 2 == 0) {
                    quantidade++;
                }
               continue;
            }
            char[] valores = converterString.toCharArray();
            var soma = 0;
            for (int j = 0; j < valores.length; j++) {
                soma += (int) Character.getNumericValue(valores[j]);
            }
            if (soma % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);
    }
}
