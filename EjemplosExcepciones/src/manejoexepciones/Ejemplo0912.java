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
public class Ejemplo0912 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {

            try {
                System.out.println("Ingrese un pais:");
                String valor1 = entrada.nextLine();
                valor1=valor1.toLowerCase();
                if (valor1.startsWith("a")||
                        valor1.startsWith("e")||
                        valor1.startsWith("i")||
                        valor1.startsWith("o")||
                        valor1.startsWith("u")){
                    System.out.println(valor1);
                    bandera = false;
                }else{
                    throw new Exception("El país empieza con una letra");
                }
                } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            
            }
            
        }
        
    }

}

