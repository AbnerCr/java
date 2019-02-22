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
public class e22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float distancia = 0;
       
        
        System.out.println("ingrese una distancia en mestros");
        distancia = Float.valueOf(entrada.next());
        System.out.println("su distancia en pulgadas es de:."+(distancia*39.37));
        System.out.println("su distancia en pies es de:."+(distancia*3.28));
        
        
    }
    
}
