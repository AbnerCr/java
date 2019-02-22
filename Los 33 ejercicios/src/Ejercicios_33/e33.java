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
public class e33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        float libras = 0;
        double kilogramos = 2.2056;
        float total = 0;
         System.out.println("Coversion de libras a kilogramos");
         System.out.println("Ingrese el valor que desea convertir:.");
         libras = Float.valueOf(entrada.next());
         total = (float) (libras * kilogramos);
         System.out.println("El resultado es de :."+total);
         
    }
    
}
