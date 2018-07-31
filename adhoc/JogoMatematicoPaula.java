import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class JogoMatematicoPaula {

    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int casos_teste;
        String sequencia;
        
        casos_teste = s.nextInt();
        
        for (int i = 0; i < casos_teste; i++) {
            
            sequencia = s.next();
            char[] caracteres = sequencia.toCharArray();
            int resultado = 0;
            int numero1 = Integer.parseInt(String.valueOf(caracteres[0]));
            int numero2 = Integer.parseInt(String.valueOf(caracteres[2]));
            
            if (numero1 == numero2){
                resultado = numero1 * numero2;
            }
            else if (Character.isUpperCase(caracteres[1])) {
                resultado = numero2 - numero1;
            }
            else {
                resultado = numero1 + numero2;
            }
            
            System.out.println(resultado);
        }
        
    }
    
}
