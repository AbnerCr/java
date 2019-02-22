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
public class e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 19.Un alumno desea saber cual será su calificación final en la materia 
        de Algoritmos. Dicha calificación se compone de tres exámenes parciales.*/
        Scanner entrada = new Scanner(System.in);
        int nota_1 = 0;
        int nota_2 = 0;
        int nota_3 = 0;
        int n_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        nota_1 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa segunda nota:.");
        nota_2 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa tercera nota:.");
        nota_3 = Integer.valueOf(entrada.next());
        
        System.out.println("Tu nota final es:"+(nota_1 + nota_2 + nota_3));
    }
    
}
