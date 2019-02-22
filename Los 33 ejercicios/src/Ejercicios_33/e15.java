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
public class e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Obtener la edad de una persona en meses, si se ingresa su edad en años y meses. 
        Ejemplo: Ingresado 3 años 4 meses debe mostrar  40 mese*/
        Scanner entrada = new Scanner(System.in);
        int años = 0;
        int meses = 0;
        int edad = 0;
        System.out.println("Ingresa años ");
        años = Integer.valueOf(entrada.next());
        System.out.println("Ingresa meses ");
        meses = Integer.valueOf(entrada.next());
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es:."+ edad);
        
    }
    
}
