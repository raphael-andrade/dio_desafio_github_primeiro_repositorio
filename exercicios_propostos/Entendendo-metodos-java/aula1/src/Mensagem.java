import java.util.Calendar;

public class Mensagem {
    public static void Messagem() {
        Calendar calendar = Calendar.getInstance();
        double horario = calendar.get(Calendar.HOUR_OF_DAY);
        if ( horario > 5 && horario < 12) {
            System.out.println("Bom dia");
        } else if ( horario > 12 && horario < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }

}
