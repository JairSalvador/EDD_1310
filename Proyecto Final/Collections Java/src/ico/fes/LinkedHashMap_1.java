package ico.fes;
import java.util.LinkedHashMap;

public class LinkedHashMap_1 {
    
    public static void main(String[] args) {
        LinkedHashMap diccionario = new LinkedHashMap();
        
        //Añadir valores (no los ordena)
        diccionario.put(3, "User1");
        diccionario.put(4, "User2");
        diccionario.put(6, "User4");
        diccionario.put(2, "User3");
        
        //Imprime todo 
        System.out.println(diccionario.entrySet());
        
        //Imprime todos el valor solicitando la llave
        System.out.println(diccionario.get(6));
        
        //Imprime las llaves
        System.out.println(diccionario.keySet());
        
        //Imprime el Usuario de un indice de otro diccionario
        System.out.println(diccionario.getOrDefault(4, diccionario));
        
        System.out.println(diccionario);
    }
}
