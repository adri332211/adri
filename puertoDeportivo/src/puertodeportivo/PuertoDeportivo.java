/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puertodeportivo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PuertoDeportivo {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<embarcacion> barcos = new ArrayList<embarcacion>();

    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        do {
            //pintar el menu.
            System.out.println("INTRODUCE OPCION");
            System.out.println("1-insertar un elemento");
            System.out.println("2-mostrar todos los barcos");
            System.out.println("3-modificar el dni del patron de un barco");
            System.out.println("4-mostrar todos los barcos ordenados por la matricula");
            System.out.println("5-eliminar un barco");
            System.out.println("0-salir");
            opcion = sc.nextInt();
            //limpiamos el buffer
            sc.nextLine();
            switch (opcion) {
                case 1:
                    insertarElemento();
                    break;
                case 2:
                    mostrarBarcos();
                    break;
            }

        } while (opcion != 0);

    }

    public static void insertarElemento() {
        //creamos un patron sin parametros
        patron p = new patron();
        //introducimos un dni
        System.out.println("introduce un dni");
        p.setDni(sc.nextLine());
        //rellenamos el numero del carnet
        System.out.println("introduce un numero de carnet");
        p.setNumCarnet(sc.nextLine());
        //creamos una embarcacion sin parametros
        embarcacion e = new embarcacion();
        //rellenamos la matricula
        System.out.println("introduce una matricula");
        e.setMatricula(sc.nextLine());
        //rellenamos los dias
        System.out.println("introduce un numero de dias");
        e.setDias(sc.nextInt());
        e.setPatron(p);
        //creamos un velero sin parametros
        veleros v = new veleros();
        //rellenamos la eslora
        System.out.println("introduce la eslora");
        v.setEslora(sc.nextFloat());

        //rellenamos el costeDia del velero sin parametros
        System.out.println("introduce un costeDia para el velero");
        v.setCosteDia(sc.nextFloat());
        v.setPatron(p);
        //creamos un yate sin parametros
        yates y = new yates();
        //rellenamos la potencia
        System.out.println("introduce la potencia");
        y.setPotencia(sc.nextInt());
        //rellenamos el costeDia del yate sin parametros
        System.out.println("introduce un costeDia para el velero");
        y.setCosteDia(sc.nextFloat());
        y.setPatron(p);
        barcos.add(e);
    }

    public static void mostrarBarcos() {
        //recorremos el araylist
        for (int i = 0; i < barcos.size(); i++) {
            //obtenemos el barco de la posicion i
           barcos.get(i).mostrar();
           
        }

    }

}
