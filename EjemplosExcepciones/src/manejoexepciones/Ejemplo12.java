/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        boolean bandera = true;
        while (bandera) {
            try {
                for (int i = 0; i < resultados.length; i++) {
                    System.out.println("Ingrese el primero valor");
                    int suma1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    int suma2 = entrada.nextInt();
                    resultados[i] = suma1 / suma2;
                }

            } catch (Exception e) {
                bandera = false;
            }
            System.out.printf("", resultados);

            /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        }
    }
}
