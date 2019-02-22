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
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cubico = (float)0.5;
        float largo = 0;
        float anch = 0;
        
        System.out.println("Ingrese largo de la pared en metros:");
        largo = Float.valueOf(entrada.next());
        System.out.println("Ingrese ancho de la pared en metros:");
        anch =  Float.valueOf(entrada.next());
        
        System.out.println("La arena requerida es:."+ ((largo * anch )*cubico));
        
    }
    
}
