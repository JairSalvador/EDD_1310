package ico.fes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Balanceo {
    private String nombre;
    private String linea;
    private PilasADT<Character> lista = new PilasADT();
    private int cont=0;
    private int cont2=0;
    
    
    public Balanceo(String nombre){
        this.nombre = nombre;
    }
    
    public String balanceo() throws FileNotFoundException, IOException{
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));
        
        linea = buffer.readLine();
        while (linea != null) {
            
            System.out.println(linea);
            char arreglo_letras[] = linea.toCharArray();
            for (int i = 0; i < arreglo_letras.length; i++) {
                if (arreglo_letras[i] == '(') {
                    lista.push('(');
                    cont++;

                } else if (arreglo_letras[i] == ')') {
                    if (!lista.isEmpty()) {
                        lista.pop();
                        cont2++;
                    }
                }
            }
            linea = buffer.readLine();
        }
        if (lista.isEmpty()) {
            return "\nSALIDA: Esta correctamente balanceada en parentesis \n" +
            "Numero de parentesis abiertos: " + cont + "\n"+
            "Numero de parentesis cerrados: " + cont2 + "\n\n";

        } else {
            return "\nSALIDA: No esta balanceada en parentesis \n" +
            "Numero de parentesis abiertos: " + cont + "\n"+
            "Numero de parentesis cerrados: " + cont2 + "\n\n";
        }
    }
}
