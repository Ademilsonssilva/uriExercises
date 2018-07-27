
import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class LeituraOtica {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int questoes;
        int leitura;
        String alternativa;
        String[] respostas;
        
        while (true) {
            
            questoes = s.nextInt();
            
            if (questoes == 0) {
                break;
            }
            respostas = new String[questoes];
            for (int i = 0; i < questoes; i++) {
                alternativa = "";
                for (int j=0; j < 5; j++) {
                    leitura = s.nextInt();
                    if (leitura <= 127) {
                        if (alternativa.equals("")) {
                            switch(j) {
                                case 0:
                                    alternativa = "A";
                                    break;
                                case 1:
                                    alternativa = "B";
                                    break;
                                case 2:
                                    alternativa = "C";
                                    break;
                                case 3:
                                    alternativa = "D";
                                    break;
                                case 4:
                                    alternativa = "E";
                                    break;
                            
                            }
                        }
                        else {
                            alternativa = "*";
                        }
                    }
                    
                }
                alternativa = alternativa.equals("") ? "*" : alternativa;
                respostas[i] = alternativa;
                                
            }
            
            for (int i = 0; i < respostas.length; i++) {
                System.out.println(respostas[i].trim());
            }
               
        }
    }
    
}
