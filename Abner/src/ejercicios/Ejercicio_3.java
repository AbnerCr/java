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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 10 números enteros. Debemos mostrarlos
        //en el siguiente orden: el primero, el último, el segundo,
        //el penúltimo, el tercero, etc.
        
        Scanner de = new Scanner(System.in);
        int datos[];
        datos = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un valor por favor:. ");
            datos[i] = Integer.valueOf(de.next());
        }
        System.out.println("los valores son:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ datos[i]+" valor2-"+datos[9-i]);
        }
    }
    
}
