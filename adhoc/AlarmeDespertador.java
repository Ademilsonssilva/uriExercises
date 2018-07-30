
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class AlarmeDespertador {
    
    public static void main (String[] args) {
        
        int hora_agora, minuto_agora;
        int hora_despertar, minuto_despertar;
        Scanner s = new Scanner(System.in);
        Calendar agora, despertar;
        
        while (true) {
            
            hora_agora = s.nextInt();
            minuto_agora = s.nextInt();
            
            hora_despertar = s.nextInt();
            minuto_despertar = s.nextInt();
            
            if (hora_agora == minuto_agora && hora_despertar == minuto_despertar && hora_agora == hora_despertar && hora_agora == 0) {
                break;
            }
            
            agora = Calendar.getInstance();
            despertar = Calendar.getInstance();
            
            agora.set(Calendar.HOUR_OF_DAY, hora_agora);
            agora.set(Calendar.MINUTE, minuto_agora);
            agora.set(Calendar.SECOND, 0);
            
            despertar.set(Calendar.HOUR_OF_DAY, hora_despertar);
            despertar.set(Calendar.MINUTE, minuto_despertar);
            despertar.set(Calendar.SECOND, 0);
            
            if (hora_agora > hora_despertar || (hora_agora == hora_despertar && minuto_agora > minuto_despertar)) {
                
                despertar.add(Calendar.DAY_OF_MONTH, 1);
                
            }
            
            System.out.println(((despertar.getTimeInMillis() - agora.getTimeInMillis()) / 1000) /60);
            
            
        }
    }
    
}
