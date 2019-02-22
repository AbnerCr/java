/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_33;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class e30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese raiz:.");
        numero= entrada.nextInt();
        float resul = (float) Math.sqrt(numero);
        System.out.println("La raiz es de "+numero+"es:."+resul);
        
    }
}