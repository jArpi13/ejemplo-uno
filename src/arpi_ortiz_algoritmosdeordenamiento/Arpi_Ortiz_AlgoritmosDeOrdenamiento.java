/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arpi_ortiz_algoritmosdeordenamiento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arpi
 */
public class Arpi_Ortiz_AlgoritmosDeOrdenamiento {

    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList();
        Scanner s = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("TAREA: ALGORTIMOS DE ORDENAMIENTO");
        System.out.println("Elaborado por: Arpi Joel, Ortiz Karen");
        System.out.println("=====================================");
        System.out.print("Ingrese el número de valores a ingresar: ");
        int n = s.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector.add(s.nextInt());
        }
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("Escoja el algoritmo de ordenamiento");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja con ajuste");
        System.out.print("Escoja una opción: ");
        int opc = s.nextInt();
        switch(opc){
            case 1:
                System.out.println("Algoritmo Selección");
                break;
            case 2:
                System.out.println("Algoritmo Inserción");
                Insercion ins = new Insercion();
                ins.ordenamientoInsercion(vector);
                break;
            case 3:
                System.out.println("Algortimo Burbuja con Ajuste");
                BurbujaConAjuste bur = new BurbujaConAjuste();
                bur.ordenamientoBurbujaConAjuste(vector);
                break;
        }
    }
    
}
