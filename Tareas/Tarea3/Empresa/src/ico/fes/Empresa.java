package ico.fes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import adts.Arreglo;
import adts.Empleado;

public class Empresa extends Empleado {

    public static void main(String[] args) {
        String linea;
        String datos[];
        int i = 1;
        Arreglo<Empleado> lista = new Arreglo(15);

        try {

            BufferedReader buffer = new BufferedReader(new FileReader("junio.dat"));
            //Lee la linea del archivo y lo asigna a un String
            linea = buffer.readLine();
            //Ciclo que si el lector detecta que es distindo de nada se finaliza el ciclo
            while (linea != null) {
                //Imprime la linea que leyó
                System.out.println(linea);
                //Asigna en un arreglo String y separa por comas todos los datos del empleado
                datos = linea.split(",");
                //Creamos el objeto empleado y le asignamos los datos del String ya separado por .split
                Empleado empleado = new Empleado(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), Integer.parseInt(datos[6]));
                //Añadimos el objeto al Arreglo de empleado con un contador para almacenar en distintos espacios del arreglo
                lista.setElemento(i, empleado);
                i++;
                //Lea de nuevo la siguiente linea del archivo
                linea = buffer.readLine();
            }
            int mayor = 0;
            int menor = 0;
            /**
             *Utilice un ciclo for para que fuera imprimiendo al empleado y su sueldo correspondiente
             * y sentencia if para que comparara y me diera el valor del año más joven y más viejo
             */
            for (int j = 1; j < 15; j++) {
                int k = 2;

                System.out.println(lista.getElemento(j) + " Sueldo total= " + lista.getElemento(j).calcularSueldo1());
                if (lista.getElemento(j).getAnioIngreso() < lista.getElemento(k).getAnioIngreso()) {

                    mayor = lista.getElemento(k).getAnioIngreso();
                    menor = lista.getElemento(j).getAnioIngreso();

                } else {
                    mayor = lista.getElemento(j).getAnioIngreso();
                    menor = lista.getElemento(k).getAnioIngreso();

                }
                k++;

            }
            int m;
            int n = 1;
            /*
            Utilice otro ciclo pero ahora para obtener el empleado más viejo y más joven laborando
            comparando el valor del año con los valores mayor y menor para obtener justo el empledo
            que cumplia con las caracteristicas
            */
            for (m = 1; m < 15; m++) {
                if (lista.getElemento(m).getAnioIngreso() == mayor) {
                    System.out.println("El empleado con mayor antiguedad es :" + lista.getElemento(m)
                            + " empezo a laborar en el año: " + mayor);
                }
                if (lista.getElemento(n).getAnioIngreso() == menor) {
                    System.out.println("El empleado con menor antiguedad es :" + lista.getElemento(n)
                            + " empezo a laborar en el año: " + menor);
                }
                n++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
