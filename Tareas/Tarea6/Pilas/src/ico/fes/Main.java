//Jair Argel Salvador Arrieta
package ico.fes;

public class Main {
    public static void main(String[] args) {
        PilasADT<String> pila = new PilasADT<>();
        System.out.println("AGREGAR ELEMENTOS");
        pila.push("Angela");
        pila.push("Diego");
        pila.push("Juan");
        
        System.out.println("ESTA LLENA?");
        System.out.println(pila.isEmpty());
        System.out.println(pila);
        pila.push("Diana");
        System.out.println(pila);
        
        System.out.println("QUITAR ELEMENTOS");
        String sacado = pila.pop();
        System.out.println(pila);
        System.out.println("Sacamos: " + sacado);
        
        System.out.println("CONSULTAR TOPE");
        System.out.println(pila.peek());
        
        System.out.println("ESTA LLENA?");
        System.out.println(pila.isFull());
        pila.push("Pablo");
        pila.push("Jaime");
        pila.push("Carlos");
        System.out.println(pila);
        
        System.out.println("TAMANIO");
        System.out.println(pila.getLength());
        System.out.println(pila.isFull());
        
    }
    
}
