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
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*calcular el nuevo salario de un empleado 
        si se le descuenta el 20% de su salario actual.*/
        Scanner entrada = new Scanner(System.in);
        float descuento =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingresa tu sueldo actual:");
        sueldo = Float.valueOf(entrada.next());
        System.out.println("Tu nuevo sueldo es: "+ (sueldo - (sueldo * descuento)));
    }
    
}
