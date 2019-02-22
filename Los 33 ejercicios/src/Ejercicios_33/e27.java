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
public class e27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int año_nac= 0;
        int año_actual= 0;
        System.out.println("Ingrese fecha de nacimiento:.");
        año_nac = Integer.valueOf(entrada.next());
        System.out.println("Ingrese año actual:.");
        año_actual = Integer.valueOf(entrada.next());
        
        int edad = (año_actual - año_nac);
        if (edad > 0 && año_nac > 0 && año_actual > año_nac){
            System.out.println("Edad actual es:."+(año_actual- año_nac));
            
        }
        else{
            System.out.println("Es invalida");
        }
        
         
        
    }
    
}
