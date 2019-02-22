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
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*13.Leer dos números y encontrar:
a.La suma del doble del primero mas el cuadrado del segundo. 
b.El promedio de sus cubos.*/
        Scanner entrada = new Scanner(System.in);
        
        int valor_1 = 0;
        int valor_2 = 0;
        int ope1 = 0;
        int ope2 = 0;
        
        System.out.println("Ingresa el primer valor:");
        valor_1 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa el segundo valor:");
        valor_2 = Integer.valueOf(entrada.next());
        ope1 = (valor_1 * 2) + (valor_2 *valor_2);
        ope2 = ((valor_1 * valor_1 * valor_1)+(valor_2 * valor_2 * valor_2))/3;
        
        System.out.println("La primera operacion es: " + ope1);
        System.out.println("La segunda operacion es: " + ope2);
    }
    
}
