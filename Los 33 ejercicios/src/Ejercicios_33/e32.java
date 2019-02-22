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
public class e32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float cm = 0;
        float Pulgadas = (float) 0.39737;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas");
        cm = Float.valueOf(entrada.next());
        
        System.out.println("la medida en pulgadas es de:."+(cm*Pulgadas));
        
    }
}
