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
public class e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*8.Escriba un algoritmo que dada la cantidad de monedas 
        de 5-10-12,5-25-50 cent y 1 Bolivar, diga la cantidad de dinero 
        que se tiene en total.*/
        Scanner entrada = new Scanner(System.in);
        float Monenda_1 = (float) 0.05;
        float Moneda_2 = (float) 0.1;
        float Moneda_3 = (float) 0.12;
        float Moneda_4 = (float) 0.25;
        float Moneda_5 = (float) 0.50;
        float Moneda_6 = (float) 1;
        float moneda1 = (float) 0;
        float moneda2 = (float) 0;
        float moneda3 = (float) 0;
        float moneda4 = (float) 0;
        float moneda5 = (float) 0;
        float moneda6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ingrese cantidad de monedas de 0.05:");
        moneda1 = Float.valueOf(entrada.next());
        System.out.println("Ingrese cantidad de monedas de 0.10:");
        moneda2 = Float.valueOf(entrada.next());
        System.out.println("Ingrese cantidad de monedas de 0.12:");
        moneda3 = Float.valueOf(entrada.next());
        System.out.println("Ingrese cantidad de monedas de 0.25:");
        moneda4 = Float.valueOf(entrada.next());
        System.out.println("Ingrese cantidad de monedas de 0.5:");
        moneda5 = Float.valueOf(entrada.next());
        System.out.println("Ingrese cantidad de monedas de 1:");
        moneda6 = Float.valueOf(entrada.next());
        total = (moneda1 * Monenda_1) + (moneda2 * Moneda_2) + (moneda3 * Moneda_3) + (moneda4 * Moneda_4) + (moneda5 * Moneda_5) + (moneda6 * Moneda_6); 
        System.out.println("Total: "+ total);
    }
    
}
