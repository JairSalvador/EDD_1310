//Salvador Arrieta Jair Argel 1310
package arreglo;
import java.util.ArrayList;

public class Arreglo {
    int tamanio;
    private int longitud;
    private String valor;
    private int indice;
    ArrayList<String> Arr = new ArrayList<>();

    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setElemento(int indice,String valor) {
        this.indice = indice;
        this.valor = valor;
        Arr.add(indice,valor);
    }

    public int getElemento(int indice) {
        return indice;
    }
    
    public void limpiar (String valor){
        Arr.clear();
        for (int i = 0; i < Arr.size(); i++) {
            Arr.add(valor);
        }
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + ", longitud=" + longitud + ", valor=" + valor + ", indice=" + indice + '}';
    }
    
}
