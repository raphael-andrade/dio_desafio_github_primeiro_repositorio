import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<temperatura> temperaturas = new ArrayList<>();
        int numeroDeMeses;

        System.out.print("Número de meses para análise: ");
        numeroDeMeses = sc.nextInt();

        for (int i=0; i < numeroDeMeses; i++){
            System.out.print("Temperatura: ");
            double temperatura = sc.nextDouble();
            System.out.print("Mês: ");
            String mes = sc.next();
            temperaturas.add(new temperatura(mes,temperatura));
        }
            double soma = 0;
        for (int y=0; y < temperaturas.size(); y++){
           double temp = temperaturas.get(y).getTemp();
           soma += temp;
        }
        double media = soma / temperaturas.size();
        System.out.println(("Media de temperatura: " + media));

        for (int count = 0; count < numeroDeMeses; count ++) {
            double valor = temperaturas.get(count).getTemp();
            if (valor > media){
                System.out.println(temperaturas.get(count));
                }
            }
        }
    }