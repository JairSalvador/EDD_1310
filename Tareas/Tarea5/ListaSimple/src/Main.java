//Salvador Arreita Jair Argel
public class Main {

    public static void main(String[] args) {
        ListaLigadaADT head = new ListaLigadaADT();
        System.out.println("Regresa true si esta vacia y false si no esta vacia"); 
        System.out.println(head.estaVacia());
        System.out.println(head.getTamanio());
        System.out.println(head.transversal());
        System.out.println("-------------------------");
        

        head.agregarAlFinal(10);
        head.agregarAInicio(12);
        head.agregarAlFinal(13);
        head.despuesDe(1, 11);
        
        System.out.println("La primera lista");
        System.out.println(head.transversal());
        System.out.println(head.estaVacia());
        System.out.println(head.getTamanio());
        System.out.println(head.buscar(12));
        System.out.println(head.buscar(10));
        System.out.println(head.buscar(11));
        System.out.println("--------------------------");
        
        System.out.println("Al atualizar:");  
        head.actualizar(10,15);
        System.out.println(head.transversal());
        System.out.println(head.buscar(15));
        System.out.println("--------------------------");

        head.eliminar(2);
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.eliminarElPrimero();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.eliminarElFinal();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());
        
        

    }
}
