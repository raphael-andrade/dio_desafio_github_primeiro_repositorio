import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes,
        conforme exemplo abaixo. Imprima o vetor N.*/

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        int[] N = {};
        for (int i=0; i < 1000;){
            for (int j=0; j< t; j++){
                if(t >=2 && t<= 50) {
                    System.out.println("N[" + i + "] = " + j);
                    i++;
                }
                if (i==1000){
                    break;
                }

            }
        }
    }
}