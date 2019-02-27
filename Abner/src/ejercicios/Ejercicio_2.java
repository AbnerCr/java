/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 5 números por teclado y a continuación 
        //realizar la media de los números positivos, 
        //la media de los negativos y contar el número de ceros.
        
        Scanner Entrada = new Scanner(System.in);
        int numeros[];
        numeros = new int[5];
        int conta_p = 0, conta_n = 0, conta_0 = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un valor por favor:. ");
            numeros[i] = Integer.valueOf(Entrada.next());
            if(numeros[i] > 0){
                conta_p++;
            }
            else if(numeros[i] < 0){
                conta_n++;
            }
            else{
                conta_0++;
            }
        }
        
        System.out.println("La cantidad de positivos es "+ conta_p);
        System.out.println("La cantidad de negativos es "+ conta_n);
        System.out.println("La cantidad de ceros es "+ conta_0);
    }
    
}
