

public class ConjuntosMain {
    public static void main(String[] args) {
        Conjunto lista = new Conjunto();
        
        lista.ConjuntoCa(3);
        lista.ConjuntoCb(4);
        
        lista.Ca("1", 0);
        lista.Ca("2", 1);
        lista.Ca("3", 2);
        
        lista.Cb("5", 0);
        lista.Cb("4", 1);
        lista.Cb("3", 2);
        lista.Cb("2", 3);
        
        //Operaciones
        System.out.println(lista.Union());
        System.out.println(lista.Interseccion());
        System.out.println(lista.Diferencia());
        System.out.println("");
        
        //Metodo Contiene t o f
        System.out.println(lista.Contiene("2"));
        System.out.println(lista.Contiene("10"));
        System.out.println("");
        
        //Metodo Agragar 
        lista.Agregar("6");
        System.out.println(lista.Cb(0) +";"+lista.Cb(1) +";"+lista.Cb(2) + ";"+lista.Cb(3));
        System.out.println("");
        
        //Metodo Eliminar
        lista.Eliminar("2F");
        System.out.println(lista.Ca(0) +";"+lista.Ca(1) +";"+lista.Ca(2));
        
        lista.Ca("1", 0);
        lista.Ca("2", 1);
        lista.Ca("3", 2);
        
        lista.Cb("1", 0);
        lista.Cb("2", 1);
        lista.Cb("3", 2);
        
        //Metodo esIgual T
        System.out.println(lista.esIgual());
        
        lista.Ca("1", 0);
        lista.Ca("2", 1);
        lista.Ca("3", 2);
        
        lista.Cb("1", 0);
        lista.Cb("5", 1);
        lista.Cb("3", 2);
        
        
        //Metodo esIgual F
        System.out.println(lista.esIgual());
        System.out.println("");
        
        lista.ConjuntoCa(4);
        
        lista.Ca("1", 0);
        lista.Ca("2", 1);
        lista.Ca("3", 2);
        lista.Ca("4", 3);
        
        lista.Cb("1", 0);
        lista.Cb("2", 1);
        lista.Cb("3", 2);
        
        //Metodo subConjunto
        System.out.println(lista.esSubConjunto());
        
        
    }
}
