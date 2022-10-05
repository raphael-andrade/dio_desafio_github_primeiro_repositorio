import java.util.*;


//vermelho, laranja, amarelo, verde, azul, anil (ou índigo) e violeta.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> coresArcoIris = new TreeSet<>();
        System.out.println("Escreva as cores do arco-iris");
        for (int i = 0; i < 7; i++) {
            String cor = scan.nextLine().toLowerCase();
            coresArcoIris.add(cor);
        }
        System.out.println("A. e C. Exiba todas as cores uma abaixo da outra: ");
        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }
        System.out.println("B. A quantidade de cores que o arco-iris tem: " + 7);

        Iterator<String> iterator = coresArcoIris.descendingIterator();
        System.out.println("D. Exiba as cores na ordem inversa que foi informada ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String letra;
        System.out.print("Digite a primeira letra das cores a serem exibidas ");
        String letraDigitada = scan.nextLine().toLowerCase();

        while (letraDigitada.chars().count() != 1) {
            System.out.print("Letra incorreta, tente novamente ");
            letraDigitada = scan.next();
        }
        System.out.println("Cores começando com a letra " + letraDigitada);
        for (String cor:coresArcoIris) {
            letra = String.valueOf(cor.charAt(0));
            if (letra.equals(letraDigitada)) {
                System.out.println(cor);
            }
        }
        System.out.println("Cores que não começam com a letra " + letraDigitada);
        for (String cor:coresArcoIris) {
            letra = String.valueOf(cor.charAt(0));
            if (!letra.equals(letraDigitada)) {
                System.out.println(cor);
            }
            else{
                coresArcoIris.remove(cor);
            }
        }
        coresArcoIris.clear();
        if (coresArcoIris.isEmpty()){
            System.out.println("Lista apagada");
        }
    }
}

