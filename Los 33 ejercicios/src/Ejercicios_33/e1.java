/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_33;

/**
 *
 * @author Abner
 */
public class e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1.Una persona recibe un préstamo de Bs. 10.000,00 de
        un banco y desea saber cuánto pagará de interés, si el 
                banco le cobra una tasa del 27% anual.*/
        System.out.println("Calculo de interes del prestamo de 10,000 por el 27%");
        int prestamo = 10000;
        double interes =(float) prestamo * 0.027;
        System.out.println("El prestamo es de 10,000");
        System.out.println("Tu interes a pagar es "+ interes);
        System.out.println("Fin del programa");
    }
    
}
