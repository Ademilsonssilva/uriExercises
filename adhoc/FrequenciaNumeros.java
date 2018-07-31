import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Ademilson
 */
public class FrequenciaNumeros {

    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        Map<Integer, Integer> numeros = new HashMap<Integer, Integer>();
        int quantidade, novoNumero;
        
        quantidade = s.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            
            novoNumero = s.nextInt();
            
            if (numeros.containsKey(novoNumero)) {
                numeros.put(novoNumero, numeros.get(novoNumero)+1);
            }
            else {
                numeros.put(novoNumero, 1);
            }   
        }
        
        Map<Integer, Integer> mapaOrdenado = new TreeMap<>(numeros);
        
        mapaOrdenado.forEach((chave, valor) -> {
            System.out.println( chave + " aparece " + valor + " vez(es)");
        });
    }
    
}
