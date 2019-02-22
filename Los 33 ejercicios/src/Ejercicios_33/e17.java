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
public class e17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 17.Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, 
        el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        tres ventas que realiza en el mes y el total que recibirá en el mes 
        tomando en cuenta su sueldo base y comisiones.*/
        Scanner entrada = new Scanner(System.in);
        float TAZA = (float) 0.10;
        float sueldo = (float) 0;
        float venta_1 = (float) 0;
        float venta_2 = (float) 0;
        float venta_3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = Float.valueOf(entrada.next());
        
        System.out.println("Ingrese valor de la primera venta:");
        venta_1 = Float.valueOf(entrada.next());
        System.out.println("Ingrese valor de la segunda venta:");
        venta_2 = Float.valueOf(entrada.next());
        System.out.println("Ingrese valor de la tercera venta:");
        venta_3 = Float.valueOf(entrada.next());
        
        comision = (venta_1 + venta_2 + venta_3) * TAZA;
        
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("tu comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
        
    }
    
}
