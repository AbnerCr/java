/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_33;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*9.Escriba un algoritmo que dado el número de horas 
        trabajadas por un empleado y el sueldo por hora,
        calcule el sueldo total de ese empleado. Tenga en cuenta 
        que las horas extras se pagan el doble.*/
        Scanner entrada = new Scanner(System.in);
        float precio = (float) 0;
        int horas = 0;
        int horas_x = 0;
        
        System.out.println("Ingresa precio de hora:");
        precio = Float.valueOf(entrada.next());
        System.out.println("Ingresa horas trabajadas:.");
        horas = Integer.valueOf(entrada.next());
        System.out.println("Ingresa horas extra trabajadas:.");
        horas_x = Integer.valueOf(entrada.next());
        
        System.out.println("Tu sueldo es:."+ ((precio * horas) +(precio * (horas_x * 2))));
    }
    
}
