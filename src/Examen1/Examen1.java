/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import java.util.Scanner;

/**
 *
 * @author schaves
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombreEmpresa = "";
        String nombreProvincia = "";
        int cantidadTrabajadores = 0;
        int trabajadoresCovid = 0;
        int opcion = 0;
        double ingresosPorMes = 0;
        boolean creditos = false;

        int personasAlajuela = 848146;
        int personasSanJose = 1404242;
        int personasCartago = 490913;
        int personasHeredia = 433677;
        int personasGuanacaste = 326953;
        int personasPuntarenas = 410929;
        int personasLimon = 386862;

        Scanner sc = new Scanner(System.in);

        do {
            imprimir("menu: 1.Ingresar datos de la empresa, 2. impresion de datos empresa, 3.Prestamo e interes, 4. Limpiar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    imprimir("Digite en nombre de su enmpresa");
                    nombreEmpresa = sc.nextLine();
                    imprimir("provinicia");
                    nombreProvincia = sc.nextLine();
                    imprimir("cantidad trabajadores");
                    cantidadTrabajadores = sc.nextInt();
                    imprimir("trabajadores covid");
                    trabajadoresCovid = sc.nextInt();
                    imprimir("ingresos por mes");
                    ingresosPorMes = sc.nextDouble();
                    imprimir("Credutos");
                    creditos = sc.nextBoolean();
                    break;

                case 2:
                    String stringCreditos = "no";
                    if (creditos == true) {
                        stringCreditos = "si";
                    }
                    imprimir("Informacion de la empresa:\nNombre de la empresa: " + nombreEmpresa
                            + "\nNombre provincia: " + nombreProvincia + "\nCantidad trabajadores: "
                            + cantidadTrabajadores + "\nTrabajadores con COVID: " + trabajadoresCovid
                            + "\nIngresos por mes: " + ingresosPorMes + "\n Creditos: " + stringCreditos);
                    if (trabajadoresCovid >= 20) {
                        imprimir("Alerta!, mas de 20 trabajadores infectados con Covid");
                    }
                    break;
                case 3:
                    double montoPrestamo = 0;
                    double tasaInteres = 0;
                    int poblacionProvincia = 0;
                    if (nombreProvincia.equalsIgnoreCase("Alajuela")) {
                        poblacionProvincia = personasAlajuela;
                    } else if (nombreProvincia.equalsIgnoreCase("San Jose")) {
                        poblacionProvincia = personasSanJose;
                    } else if (nombreProvincia.equalsIgnoreCase("Cartago")) {
                        poblacionProvincia = personasCartago;
                    } else if (nombreProvincia.equalsIgnoreCase("Heredia")) {
                        poblacionProvincia = personasHeredia;
                    } else if (nombreProvincia.equalsIgnoreCase("Limon")) {
                        poblacionProvincia = personasLimon;
                    } else if (nombreProvincia.equalsIgnoreCase("Guanacaste")) {
                        poblacionProvincia = personasGuanacaste;
                    } else if (nombreProvincia.equalsIgnoreCase("Puntarenas")) {
                        poblacionProvincia = personasPuntarenas;
                    }

                    if (ingresosPorMes <= 1000000) {
                        montoPrestamo = (trabajadoresCovid / cantidadTrabajadores) * poblacionProvincia;
                        if (cantidadTrabajadores > 10) {
                            if (cantidadTrabajadores > 0) {
                                tasaInteres = 0.5;
                            }
                        } else if (cantidadTrabajadores > 30) {
                            if (cantidadTrabajadores >= 10) {
                                tasaInteres = 0.4;
                            }
                        } else if (cantidadTrabajadores >= 30) {
                            tasaInteres = 0.3;
                        }
                        imprimir("El monto del prestamo es: " + montoPrestamo + " y su taasa de interes es de : " + tasaInteres);
                    } else {
                        imprimir("Su empresa no aplica para un prestamo!");
                    }
                    break;
                case 4:
                    nombreEmpresa = "";
                    nombreProvincia = "";
                    cantidadTrabajadores = 0;
                    trabajadoresCovid = 0;
                    opcion = 0;
                    ingresosPorMes = 0;
                    creditos = false;
                    break;
            }
        } while (opcion != 4);

    }

    public static void imprimir(String txt) {
        System.out.println(txt);
    }
}
