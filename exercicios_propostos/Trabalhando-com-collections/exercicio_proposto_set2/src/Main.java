import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>();
        System.out.println("Digite suas linguagens favoritas ");
        for (int i=0;i<3;i++){
            System.out.println("Digite sua " + (i+1) + "° linguagem: ");
            System.out.println("Nome: ");
            String nome = scan.next();
            System.out.println("Ano de criação: ");
            int anoCriacao = scan.nextInt();
            System.out.println("IDE: ");
            String ide = scan.next();

            LinguagemFavorita lingFav = new LinguagemFavorita(nome,anoCriacao,ide);
            linguagensFavoritas.add(lingFav);
        }
        System.out.println(linguagensFavoritas);
        Set<LinguagemFavorita> lingFav2 = new TreeSet<>(linguagensFavoritas);
        System.out.println("Nomes dos nomes  ordem natural: ");
        for (LinguagemFavorita linguagem:lingFav2) {
            System.out.println(linguagem.getNome());
        }
        System.out.println("Nomes das IDE ordem natural: ");
        for (LinguagemFavorita linguagem:lingFav2) {
            System.out.println(linguagem.getIde());
        }

    }
}
class comparandoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ide = o1.getIde().compareTo(o2.getIde());
        return ide;
    }
}