import java.util.Scanner;

/**
 *
 * @author Ademilson
 */
public class ProblemaCalculadora {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos_teste;
        String texto;

        casos_teste = s.nextInt();

        for (int i = 0; i < casos_teste; i++) {

            texto = s.next();
            
            int numero1 = Integer.parseInt(texto.substring(2, 4));
            int numero2 = Integer.parseInt(texto.substring(5, 8));
            int numero3 = Integer.parseInt(texto.substring(11, 13));
            
            System.out.println(numero1 + numero2 + numero3);
        }

    }

}
