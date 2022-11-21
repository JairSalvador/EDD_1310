//Jair Argel Salvador Arrieta
package ico.fes;

public class ColasMain {

    public static void main(String[] args) {
        Colas<String> cola = new Colas<>();
        System.out.println("ESTA VACIA?");
        System.out.println(cola.isEmpty());
        //TAMAÑO
        System.out.println("TAMANIO: " + cola.getLength());
        
        //AGREGA ELEMENTOS
        cola.enqueue("Angela");
        cola.enqueue("David");
        cola.enqueue("Zayra");
        cola.enqueue("Pablo");

        //ESTA VACIA?
        System.out.println(cola);
        System.out.println("TAMANIO: " + cola.getLength());
        System.out.println("ESTA VACIA?");
        System.out.println(cola.isEmpty());

        //QUITAR ELEMENTOS
        String sacado = cola.dequeue();
        System.out.println(cola);
        System.out.println("Sacado: " + sacado);
        sacado = cola.dequeue();
        System.out.println(cola);
        System.out.println("Sacado: " + sacado);

        //TAMAÑO
        System.out.println("TAMANIO: " + cola.getLength());

    }
}
