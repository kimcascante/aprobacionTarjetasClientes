package Semana6;

/**
 * Nombre del programa: 
 * Descripcion:Los bancos ofrecen el servicio de tarjetas de crédito, entre otros. Los criterios que utilizan para aprobar una solicitud y 
    asignar el cupo son los siguientes: Si el total de gastos mensuales del solicitante es menos del 60% de los ingresos se le aprueba la tarjeta, 
    en el caso contrario se le niega la tarjeta. Los gastos del solicitante son las cuotas de préstamos de vivienda (si tiene) más los gastos de sostenimiento 
    (comida, salud, educación, etc.). El cupo se asigna según la clasificación de los ingresos del usuario, si los ingresos del usuario son menores o iguales a $500, 
    el usuario es de clase 1. Si los ingresos del usuario son mayores a $500 y menores o iguales a $1000, el usuario es de clase 2. Si los ingresos del usuario son mayores 
    que $1000 el usuario es de clase 3. El cupo del usuario depende de la clase: si es de clase 1 el cupo es del 80% de su salario, si es de clase 2 el cupo es del 100% de 
    su salario y si es de clase 3 el cupo es del 150% de su salario. Se quiere saber si se acepta la tarjeta o no y en caso de que se acepte, se quiere saber el cupo. 
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp6w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        double gastosMensuales;
        double ingreso;
        int clientes;
        double porcentajeGastos;

        int tarjetasAprobadas=0;
        int tarjetasRechazadas=0;

        escribir.println("Digite la cantidad de clientes a analizar:");
        clientes = Integer.parseInt(leer.readLine());

        for(int count=1; count<=clientes; count++){
            escribir.println("Digite el ingreso para el cliente " +count+ " :");
            ingreso = Double.parseDouble(leer.readLine());

            escribir.println("Digite los gastos mensuales para el cliente " +count+ " :");
            gastosMensuales = Double.parseDouble(leer.readLine());

            porcentajeGastos = (gastosMensuales/ingreso)*100;
            escribir.println("El porcentaje de los gastos mensuales es de: "+porcentajeGastos+"%");

            if(porcentajeGastos>=60){
                tarjetasRechazadas++;
                escribir.println("La tarjeta es rechazada");
            } else {
                tarjetasAprobadas++;
                escribir.println("La tarjeta es aprobada");
            }
        }

        escribir.println("Para todas las solicitudes:");
        escribir.println("Hubieron " +tarjetasAprobadas+ " de tarjetas aprobadas");
        escribir.println("Hubieron " +tarjetasRechazadas+ " de tarjetas rechazadas");
    }
}