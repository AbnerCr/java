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
public class e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float Emergencias = (float) 0.37;
        float PEDIATRIA = (float) 0.42;
        float TRAUMATOLOGIA = (float) 0.21;
        float presupuesto = (float) 0;
        System.out.println("Ingresa presupuesto:.");
        presupuesto = Float.valueOf(entrada.next());
        System.out.println("El presupuesto para Emergencias es:"+(presupuesto * Emergencias) );
        System.out.println("El presupuesto para Pediatria es:"+(presupuesto * PEDIATRIA) );
        System.out.println("El presupuesto para Traumatologia es:"+(presupuesto * TRAUMATOLOGIA) );
    }
    
}
