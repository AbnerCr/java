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
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Calcular el descuento y el monto a
        pagar por un medicamento cualquiera en una farmacia si todos 
        los medicamentos tienen un descuento del 35%.*/
        Scanner entrada = new Scanner(System.in);
        float DESCUENTO =(float) 0.35;
        float precio = (float) 0;
        System.out.println("Ingrese el precio del medicamento:");
        precio = Integer.valueOf(entrada.next());
        System.out.println("Tu descuento es: " + (precio * DESCUENTO));
        System.out.println("Tu pago es: " + (precio - (precio * DESCUENTO)));
    }
    
}
