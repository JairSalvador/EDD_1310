//Salvador Arrieta Jair Argel 1310
package arreglo;
import java.util.ArrayList;

public class Arreglo<T>{
    int tamanio;
    ArrayList<T> datos;

    public Arreglo(int tam) {
        this.tamanio = tam;
        datos = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
        
    }

    public T getElemento(int indice) throws IndexOutOfBoundsException {
        return datos.get(indice);
    }

    public void setElemento(int indice,T dato) throws IndexOutOfBoundsException{
       this.datos.set(indice, dato);
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public void limpiar(T dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (T dato : datos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }
}
