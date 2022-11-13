//Jair Argel Salvador Arrieta 
package ico.fes;

import java.util.ArrayList;

public class PilasADT<T> {

    ArrayList datos;
    int  tope;

    public PilasADT() {
        datos = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return datos.size() == 0;
    }
    public int getLength (){
        if (tope <= 4) {
            return datos.size();
        }
        else{
            return 5;
        }
    }
     
    public T pop(){
        T sacado = (T) datos.remove(tope);
        tope --;
        return sacado;
    }
    
    public void push (T dato){
        if (tope <= 3) {
        datos.add(dato);
        tope = datos.size()-1;
        }
    }
    
    public T peek(){
        return (T) datos.get(tope);
    }
    
    public String isFull(){
        if (tope <= 3) {
            return "Aun hay espacio, solo se permiten 5 elementos";
        }
        else{
            return "Esta llena!!! solo se permiten 5 elementos";
        }
    }

    @Override
    public String toString() {
        return   "" + datos  ;
    }
    
}
