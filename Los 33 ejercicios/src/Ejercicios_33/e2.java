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
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*2.Calcula el precio de un boleto de viaje,
          tomando en cuenta el número de kilómetros que
        se van a recorrer, siendo el precio Bs/.10,50 por Km.*/
        Scanner entrada = new Scanner(System.in);
        double PRECIO_KM = 10.5;
        int km = 0;
        
        System.out.println("Ingres cantidad de km:.");
        km = Integer.valueOf(entrada.next());
        System.out.println("Su total a pagar es:." + (km * PRECIO_KM));
    }
    
}
