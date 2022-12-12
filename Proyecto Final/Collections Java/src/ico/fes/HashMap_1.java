package ico.fes;
import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        //Declaramos 
        HashMap diccionario = new HashMap();
        
        //Añadimos los valores con su respectiva llave
        diccionario.put("user1", "Zayra");
        diccionario.put("user2", "Jair");
        diccionario.put("user3", "Argel");
        
        //Imprimimos el valor consultandolo con su llave
        System.out.println(diccionario.get("user2"));
        System.out.println(diccionario.get("user1"));
        System.out.println(diccionario.get("user3"));
        
        //Consultamos si se encuentra la llave 
        System.out.println(diccionario.containsKey("user4"));
        System.out.println(diccionario.containsKey("user3"));
        
        //Consultamos si se encuntra el valor
        System.out.println(diccionario.containsValue("Zayra"));
        System.out.println(diccionario.containsValue("Salvador"));
        
        //Nos da el valor de la llave solicitada
        System.out.println(diccionario.get("user3"));
        System.out.println(diccionario.get("user4"));
        
        //Imprimimos toda la lista
        System.out.println(diccionario);
        
        //Eliminamos el valor con su llave
        diccionario.remove("user3");
        
        //Imprimimos la lista actualizada
        System.out.println(diccionario);
    }
}
