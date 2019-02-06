/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Tare_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        float numero = 0;
        float cubo =  0;
        float cuadrado = 0;
        int aumento = 0;
        
        while (aumento !=5)
        {
            System.out.println("Ingrese el numero a elevar al cubo y al cuadrado:");
            numero= entrada.nextFloat();
            cubo = numero*numero*numero;
            cuadrado = numero*numero;
            System.out.println("El cuadrado es:."+ cuadrado);
            System.out.println("El nunmero a cubo"+cubo);
            aumento++;
        }
            
            
        
            
            
        
    }
    
}
