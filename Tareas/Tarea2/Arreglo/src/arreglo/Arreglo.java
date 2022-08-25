//Salvador Arrieta Jair Argel 1310
package arreglo;

public class Arreglo {
    int tamanio;
    private int longitud;
    private String valor;
    private int indice;

    public Arreglo(int tamanio) {
        
    }

    public int getLongitud() {
        return longitud;
    }

    public void setElemento(int indice,String valor) {
        this.indice = indice;
        this.valor = valor;
    }

    public int getElemento(int indice) {
        return indice;
    }
    
    public void limpiar (String Valor){
        
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + ", longitud=" + longitud + ", valor=" + valor + ", indice=" + indice + '}';
    }
    
}
