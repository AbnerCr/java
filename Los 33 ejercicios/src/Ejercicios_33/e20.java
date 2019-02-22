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
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes*/
        Scanner entrada = new Scanner(System.in);
        int num_hombre = 0;
        int num_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        num_hombre = Integer.valueOf(entrada.next());
        System.out.println("Ingresa la cantidad de mujeres:");
        num_mujeres = Integer.valueOf(entrada.next());
        
        total = num_hombre + num_mujeres;
        
        System.out.println("El porcentaje de mujeres es:" + ((num_mujeres *100) / total));
        System.out.println("El porcentaje de hombres es:" + ((num_hombre *100) / total));
    }
    
}
