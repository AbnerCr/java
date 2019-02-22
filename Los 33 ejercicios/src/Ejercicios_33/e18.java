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
public class e18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*18.Una tienda ofrece un descuento del 15% sobre el total de la compra
        y un cliente desea saber cuanto deberá pagar finalmente por su compra.*/
        Scanner entrada = new Scanner(System.in);
        float TAZA = (float) 0.15;
        float valor_compra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        valor_compra = Float.valueOf(entrada.next());
        
        descuento = valor_compra * TAZA;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (valor_compra - descuento));
        
        
    }
    
}
