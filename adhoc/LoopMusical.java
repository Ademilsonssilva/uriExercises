
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class LoopMusical {


    public static void main (String[] args)
    {
        int casos, it;
        String sentido_anterior, sentido_atual, primeiro_sentido = "";
        int anterior = 0, primeiro_valor = 0;
        int atual, picos;
        Scanner scan = new Scanner(System.in);
        
        while(true){
            picos = 0;
            sentido_anterior = "";
            casos = scan.nextInt();
            
            if(casos == 0) {
                break;
            }
            
            for(it = 0; it < casos; it++) {
                
                atual = scan.nextInt();
                
                if (it == 0) {
                    picos++;
                    anterior = atual;
                    primeiro_valor = atual;
                }
                
                else {
                   
                   picos++;
                   
                   sentido_atual = anterior > atual ? "descendo" : "subindo";
                   anterior = atual;
                   
                   if (sentido_anterior == "") {
                       sentido_anterior = sentido_atual;
                       primeiro_sentido = sentido_atual;
                   }
                   else {
                       
                       if (sentido_anterior == sentido_atual) {
                           picos--;
                       }
                       else {
                           sentido_anterior = sentido_atual;
                       }
                       
                   }
                   
                   if (it == casos-1 && casos > 2) {
                       if (primeiro_sentido != sentido_atual) {
                           picos--;
                       }
                   }
                    
                }
                
            }
            
            System.out.println(picos);
            
        }
        
    }
}
