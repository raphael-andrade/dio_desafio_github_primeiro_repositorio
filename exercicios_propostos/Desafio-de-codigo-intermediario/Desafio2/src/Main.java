import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Desafio
        Em um jogo 2D existe um robô de limpeza que começa na posição (0,0).
        Ele recebe alguns comandos através de uma sequência de movimentos.
        Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo),
        "D"(movimento para direita) e "A"(movimento para esquerda).
        Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0).
        Retorne true se o robô retornar à origem ou false caso contrário.
        Assuma que a magnitude do movimento do robô é a mesma para cada movimento.
        Entrada
        A entrada consiste em duas Strings que representam a sequência de movimentos do Robô.
        Saída
        Cada caso de teste retorna um tipo booleano, true ou false, de acordo com a entrada e condições do desafio proposto.
    */
        Scanner scan = new Scanner(System.in);
        var x = 0;
        var y = 0;
        char letra;
        String movimentos = scan.nextLine().toUpperCase();

        for (int i = 0; i < movimentos.length(); i++) {
            letra = movimentos.charAt(i);
            if (letra == 'W') {
                x++;
            }
            if (letra == 'S') {
                x--;
            }
            if (letra == 'D') {
                y++;
            }
            if (letra == 'A') {
                y--;
            }
        }
        if (x == 0 && y == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}

