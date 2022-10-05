import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Ja trabalhou com a vítima?");

        int numeroPergunta = 0;
        int contagem = 0;
        for (String pergunta : perguntas) {
            System.out.println(perguntas.get(numeroPergunta));
            String resposta = scan.nextLine().toUpperCase();
            if (resposta.equals("SIM")) {
                contagem++;
            }
            numeroPergunta++;
        }
        if (contagem == 2) {
            System.out.println("Resultado: Suspeita");
        } else if (contagem >= 3 && contagem <= 4) {
            System.out.println("Resultado: Cumplice");
        } else if (contagem == 5) {
            System.out.println("Resultado: Assassina");
        } else {
            System.out.println("Resultado: Inocente");
        }
    }
}
