package ico.fes;

public class Main {
    public static void main(String[] args) {
        Hash<String, Integer> tabla = new Hash<>();
        tabla.add("Luis", 1);
        tabla.add("Javier", 2);
        tabla.add("Zayra", 4);
        tabla.add("Jair", 5);
        
        System.out.println(tabla.remove("Luis"));
        System.out.println(tabla.remove("Javier"));
        System.out.println(tabla.valueOf("Zayra"));
    }

}
