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
public class e31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada=new Scanner (System.in);
      System.out.println("Ingrese el radio del circulo:.");
      int radio=entrada.nextInt();
      double area=Math.pow(radio, 2)*(3.14);
      System.out.println("--------------------");
      System.out.println("Area="+area);
    }
    
}
