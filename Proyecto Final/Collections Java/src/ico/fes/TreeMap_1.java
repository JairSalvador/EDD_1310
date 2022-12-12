package ico.fes;
import java.util.TreeMap;

public class TreeMap_1 {

    public static void main(String[] args) {
        TreeMap diccionario = new TreeMap();
        
        //Añadimos valor con su llave
        diccionario.put(1, "Jair");
        diccionario.put(4, "Pedro");
        diccionario.put(3, "Juan");
        diccionario.put(2, "Mike");
        
        //Devuelve el valor con la llave solicitada
        System.out.println(diccionario.ceilingEntry(1));
        
        //Regresa el indice de la llave
        System.out.println(diccionario.floorKey(3));
        
        System.out.println(diccionario);
        
        //Elimina el valor 
        diccionario.remove(3);
        
        System.out.println(diccionario);
        
        //Regresa el valor de la mayor llave
        System.out.println(diccionario.higherEntry(2));
        
        //Regresa el valor de la mayor llave
        System.out.println(diccionario.lowerEntry(2));
        
        //Devuelve una vista de conjunto de las asignaciones contenidas en este mapa
        System.out.println(diccionario.entrySet());
        
        
    }
}
