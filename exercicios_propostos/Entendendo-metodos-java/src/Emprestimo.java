public class Emprestimo {
   public static void emprestimo(double valor, int parcelas, double juros){
       juros = juros/100;
       double valorFinal = valor;
       for (int i=0; i<=parcelas; i++){
           valorFinal+= valor * juros;
       }
       System.out.printf("Valor final R$" + "%.2f",valorFinal);
   }

}
