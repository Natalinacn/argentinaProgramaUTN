package ap.clase.pkg1;

import java.util.Scanner;

/**
 * @author Natalin Acuña
 */
public class ApClase1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        /*a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”*/

       
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {

            System.out.println(numeroInicio);
            numeroInicio++;

        }
        
        
        /*b. A lo anterior, solo muestre los números pares*/
        
       
        while (numeroInicio <= numeroFin) {

            if (numeroInicio % 2 == 0) {

                System.out.println(numeroInicio);

            }
            numeroInicio++;

        }

        /*c. A lo anterior, con una variable extra, elija si se deben mostrar los números
pares o impares.*/
        
        System.out.println("Ingrese la opción 1 para ver los números pares y 2 para ver los impares: ");
        int opcion = read.nextInt();

        while (numeroInicio <= numeroFin) {

            if (opcion == 1 && numeroInicio % 2 == 0) {

                System.out.println(numeroInicio);

            } else if (opcion == 2 && numeroInicio % 2 != 0) {

                System.out.println(numeroInicio);
            }

            numeroInicio++;

        }

        /*d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
        
     
        for (int i = numeroFin; i >= numeroInicio; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        /*Determinar si una persona pertenece al segmento de ingresos altos
“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
todas y todos los convivientes:
● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
● Tener 3 o más vehículos con una antigüedad menor a 5 años.
● Tener 3 o más inmuebles.
● Poseer una embarcación, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad económica plena.”
         */
        
  
        double ingreso = 1000;
        int cantVehiculo = 7;
        int antiguedadVehi = 3;
        int inmueble = 1;
        boolean embarcacion = false;
        boolean aeronave = false;
        boolean activos = false;
        

        if (ingreso > 489083 || inmueble >= 3 || embarcacion == true || aeronave == true || activos == true) {
            System.out.println("Usted pertenece al segmento de ingresos altos");

        } else if (cantVehiculo >= 3 && antiguedadVehi < 5) {

            System.out.println("Usted pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Usted pertenece al segmento de ingresos bajos");
        }

    }

}
