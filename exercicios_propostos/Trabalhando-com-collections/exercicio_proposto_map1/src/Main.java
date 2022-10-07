import java.util.*;

/* Estado = PE - População = 9.616.621
   Estado = AL - População = 3.351.543
   Estado = CE - População = 9.187.103
   Estado = RN - População = 3.534.265 */

public class Main {
    public static void main(String[] args) {

        Map<String, Double> estados = new LinkedHashMap<>() {{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println("Crie um dicionario e relacione os estados e suas populações: " + estados);

        estados.put("RN", 3534165d);
        System.out.println("Substitua a população do Estado do RN por 3.534.165: " + estados);

        if (!estados.containsKey("PB")) {
            System.out.println("Confira se o estado PB está no dicionario, caso contrário adicione: PB - 4.039.277");
            System.out.println("Existe PB no dicionario? " + estados.containsKey("PB"));
            estados.put("PB", 4039277d);
            System.out.println(estados);
        }
        System.out.println("Exiba a população de PE: " + estados.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Set<Map.Entry<String, Double>> entries = estados.entrySet();
        for (Map.Entry<String, Double> listaEstados : estados.entrySet()) {
            System.out.println(listaEstados);
        }
        estados = new TreeMap<>(estados);
        Set<Map.Entry<String, Double>> entries1 = estados.entrySet();

        System.out.println("Exiba todos os estados e suas populações em ordem alfabetica: ");
        for (Map.Entry<String, Double> listaEstados : estados.entrySet()) {
            System.out.println(listaEstados);
        }
        Collection<Double> populacaoEstados = estados.values();
        Double menorPopulacao = Collections.min(estados.values());
        String menorPopulacaoEstado = "";

        Set<Map.Entry<String, Double>> entries2 = estados.entrySet();

        for (Map.Entry<String, Double> populacaoEstado : entries2) {
            if (populacaoEstado.getValue().equals(menorPopulacao)) {
                menorPopulacaoEstado = populacaoEstado.getKey();
                System.out.println("Exiba o estado com menor população e sua quantidade: " + menorPopulacaoEstado + " - " + menorPopulacao);
            }
        }
        Double maiorPopulacao = Collections.max(estados.values());
        String maiorPopulacaoEstado = "";

        for (Map.Entry<String, Double> populacaoEstado : entries2) {
            if (populacaoEstado.getValue().equals(maiorPopulacao)) {
                maiorPopulacaoEstado = populacaoEstado.getKey();
                System.out.println("Exiba o estado com maior população e sua quantidade: " + maiorPopulacaoEstado + " - " + maiorPopulacao);

            }
        }
        Iterator<Double> iterator = estados.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / estados.size()));

        Iterator<Double> iterator1 = estados.values().iterator();
       while (iterator1.hasNext()) {
           if (iterator1.next() <= 4000000)
               iterator1.remove();
       }
        System.out.println(estados);
       estados.clear();
       System.out.println("Apague o dicionário de estados: " + estados);
       System.out.println("Confira se o dicionário está vazio: " + estados.isEmpty());
    }
}