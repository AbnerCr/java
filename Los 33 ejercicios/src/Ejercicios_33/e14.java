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
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*14.Leer tres números enteros de un Digito y almacenarlos en una sola 
        variable que contenga a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562.*/
        Scanner entrada = new Scanner(System.in);
        int valor_1 = 0;
        int valor_2 = 0;
        int valor_3 = 0;
        int resultado = 0;
        System.out.println("Ingresa el valor1:");
        valor_1 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa el valor2:");
        valor_2 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa el valor3:");
        valor_3 = Integer.valueOf(entrada.next());
        
        resultado = Integer.valueOf(String.valueOf(valor_1)+String.valueOf(valor_2)+String.valueOf(valor_3));
        System.out.println("El resultado es:" + resultado);
    }
    
}
