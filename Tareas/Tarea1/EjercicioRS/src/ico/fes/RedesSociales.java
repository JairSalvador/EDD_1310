package ico.fes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class RedesSociales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linea = "";
        String seguidoresT[];
        int diferenciaT;
        int cont = 0;
        int seguidoresE = 0;
        int seguidoresJ = 0;
        File archivo = new File("C:\\Users\\calav\\Documents\\EDD_1310\\Tareas\\Tarea1\\EjercicioRS\\src\\ico\\fes\\presenciaredes.csv");
        FileReader archivoLector;

        System.out.println("-----TABLA DE REDES SOCIALES-----");

        try {
            archivoLector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(archivoLector);
            while (buffer.ready()) {
                if (!(linea = buffer.readLine()).equals("")) {
                    System.out.println(linea);

                }
            }
            System.out.println("¿Que desea hacer? \nDigite el numero de la funcion que quiere");
            System.out.println("1. Mostrar en pantalla la diferencia de "
                    + "seguidores (followers) en Twitter entre el mes de enero y junio.");
            System.out.println("2. Calcular la diferencia de visualizaciones de YouTube"
                    + "entre los meses seleccionados por teclado (enero a junio 1-6).");
            System.out.println("3. Calcular el promedio de crecimiento de Twitter "
                    + "y Facebook entre los meses de enero a junio.");
            int dato = teclado.nextInt();

            switch (dato) {
                case 1 -> {
                    archivoLector = new FileReader(archivo);
                    BufferedReader buffer2 = new BufferedReader(archivoLector);
                    while (buffer2.ready()) {
                        if (!(linea = buffer2.readLine()).equals("")) {
                            cont++;
                            if (cont == 9) {
                                seguidoresT = linea.split(",");
                                seguidoresE = seguidoresE + Integer.parseInt(seguidoresT[3]);
                                seguidoresJ = seguidoresJ + Integer.parseInt(seguidoresT[8]);
                                diferenciaT = (seguidoresJ - seguidoresE);
                                System.out.println("La diferencia de"
                                        + " seguidores (followers) en Twitter entre"
                                        + " el mes de Enero y Junio: " + diferenciaT);

                            }
                        }
                    }
                }

                case 2 -> {
                    archivoLector = new FileReader(archivo);
                    BufferedReader buffer3 = new BufferedReader(archivoLector);
                    System.out.println("En que meses quiere hacer la diferencia "
                            + "(Por favor coloquelo en numeros del 1-6 Enero a Junio) ");
                    System.out.println("Inserte el primer mes:");
                    int mes1 = teclado.nextInt();
                    System.out.println("Inserte el segundo mes:");
                    int mes2 = teclado.nextInt();

                    mes1 += 2;
                    mes2 += 2;

                    while (buffer3.ready()) {
                        if (!(linea = buffer3.readLine()).equals("")) {
                            cont++;
                            if (cont == 17) {
                                seguidoresT = linea.split(",");

                                seguidoresE = seguidoresE + Integer.parseInt(seguidoresT[mes1]);
                                seguidoresJ = seguidoresJ + Integer.parseInt(seguidoresT[mes2]);
                                if (seguidoresE > seguidoresJ) {
                                    diferenciaT = (seguidoresE - seguidoresJ);
                                    System.out.println("La diferencia de visualizaciones de YouTube"
                                            + "entre los meses seleccionados por teclado es: " + diferenciaT);

                                } else {
                                    diferenciaT = (seguidoresJ - seguidoresE);
                                    System.out.println("La diferencia de visualizaciones de YouTube"
                                            + "entre los meses seleccionados por teclado es: " + diferenciaT);
                                }

                            }
                        }
                    }
                }

                case 3 -> {
                    archivoLector = new FileReader(archivo);
                    BufferedReader buffer4 = new BufferedReader(archivoLector);
                    float crecimiento = 0;
                    float crecimientoT = 0;
                    while (buffer4.ready()) {
                        if (!(linea = buffer4.readLine()).equals("")) {
                            cont++;
                            if (cont == 3) {
                                seguidoresT = linea.split(",");
                                for (int i = 3; i < 9; i++) {  
                                    crecimiento = crecimiento + Float.parseFloat(seguidoresT[i]);
                                }
                                System.out.println("El crecimieto promedio de "
                                        + "Facebook durante los meses Enero a Junio es: " + crecimiento/6);

                            }
                            if (cont == 10) {
                                seguidoresT = linea.split(",");
                                for (int i = 3; i < 9; i++) {  
                                    crecimientoT = crecimientoT + Float.parseFloat(seguidoresT[i]);
                                }
                                System.out.println("El crecimieto promedio de "
                                        + "Twitter durante los meses Enero a Junio es: " + crecimientoT/6);

                            }
                        }
                    }
                }
                default ->
                    System.out.println("El numero seleccionado no esta en el rango de las funciones");
            }

        } catch (Exception e) {
            System.out.println("Algo salió mal");
        }

    }

}
