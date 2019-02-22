/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAbner;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Ejercicios04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicitar dia mes año y validar si la fecha es correcta
        Scanner entrada = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.println("Ingrese dia:.");
        dia = Integer.valueOf(entrada.next());
        System.out.println("Ingrese mes:.");
        mes = Integer.valueOf(entrada.next());
        System.out.println("Ingrese año:.");
        año = Integer.valueOf(entrada.next());
        
        if(año > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+año+" es correcta");
                }else{
                    System.out.println("El dia es incorrecto");
                }
            }else{
                    System.out.println("El mes es incorrecto");
                }
        }else{
            System.out.println("El año es incorrecto:.");
        }
        
        
    }
    
}
