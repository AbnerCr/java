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
public class e23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float num = 0;
        
        System.out.println("ingrese numero para elevarlo al cubo");
        num = Float.valueOf(entrada.next());
        
        System.out.println("el numero elevado al cubo es "+(num*num*num));
        
    }
    
}
